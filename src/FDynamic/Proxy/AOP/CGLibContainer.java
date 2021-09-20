package FDynamic.Proxy.AOP;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class CGLibContainer {
	public static enum InterceptPoint {
		BEFORE, AFTER, EXCEPTION
	}

	//CGLibContainer在初始化的时候，会分析带有@Aspect注解的类，分析出每个类的方法在
	//调用前、调用后、出现异常时该调用哪些方法，在创建该类的对象时，如果有需要被调用的方法，
	//则创建一个动态代理对象。
	static Class<?>[] aspects = new Class<?>[] { LogAspect.class, ExceptionAspect.class };

	static Map<Class<?>, Map<InterceptPoint, List<Method>>> interceptMethodsMap = new HashMap<>();

	static {
		init();
	}

	/**
	 * 对每个切面，即带有@Aspect注解的类cls，查找其before/after/exception方法，
	 * 调用方法addInterceptMethod将其加入目标类的切点方法列表中
	 */
	private static void init() {
		for (Class<?> cls : aspects) {
			Aspect aspect = cls.getAnnotation(Aspect.class);
			if (aspect != null) {
				Method before = getMethod(cls, "before", new Class<?>[] { Object.class, Method.class, Object[].class });
				Method after = getMethod(cls, "after",
						new Class<?>[] { Object.class, Method.class, Object[].class, Object.class });
				Method exception = getMethod(cls, "exception",
						new Class<?>[] { Object.class, Method.class, Object[].class, Throwable.class });
				Class<?>[] intercepttedArr = aspect.value();
				for (Class<?> interceptted : intercepttedArr) {
					addInterceptMethod(interceptted, InterceptPoint.BEFORE, before);
					addInterceptMethod(interceptted, InterceptPoint.AFTER, after);
					addInterceptMethod(interceptted, InterceptPoint.EXCEPTION, exception);
				}
			}
		}
	}

	private static Method getMethod(Class<?> cls, String name, Class<?>[] paramTypes) {
		try {
			return cls.getMethod(name, paramTypes);
		} catch (NoSuchMethodException e) {
			return null;
		}
	}

	/**
	 *
	 * @param cls
	 * @param point
	 * @param method
	 */
	private static void addInterceptMethod(Class<?> cls, InterceptPoint point, Method method) {
		if (method == null) {
			return;
		}
		Map<InterceptPoint, List<Method>> map = interceptMethodsMap.get(cls);
		if (map == null) {
			map = new HashMap<>();
			interceptMethodsMap.put(cls, map);
		}
		List<Method> methods = map.get(point);
		if (methods == null) {
			methods = new ArrayList<>();
			map.put(point, methods);
		}
		methods.add(method);
	}

	/**
	 * 得到响应的切面
	 * @param cls
	 * @param point
	 * @return
	 */
	static List<Method> getInterceptMethods(Class<?> cls,
			InterceptPoint point) {
		Map<InterceptPoint, List<Method>> map = interceptMethodsMap.get(cls);
		if (map == null) {
			return Collections.emptyList();
		}
		List<Method> methods = map.get(point);
		if (methods == null) {
			return Collections.emptyList();
		}
		return methods;
	}

	/**
	 * 根据原始类的实际类型查找应该执行的before/after/exception方法列表，在调用原始方法前
	 * 执行before方法，
	 */
	static class AspectInterceptor implements MethodInterceptor {
		@Override
		public Object intercept(Object object, Method method, 
				Object[] args, MethodProxy proxy) throws Throwable {
			//执行before方法
			List<Method> beforeMethods = getInterceptMethods(
					object.getClass().getSuperclass(), InterceptPoint.BEFORE);
			for (Method m : beforeMethods) {
				m.invoke(null, new Object[] { object, method, args });
			}

			try {
				// 调用原始方法
				Object result = proxy.invokeSuper(object, args);

				// 执行after方法
				List<Method> afterMethods = getInterceptMethods(
						object.getClass().getSuperclass(), InterceptPoint.AFTER);
				for (Method m : afterMethods) {
					m.invoke(null, new Object[] { object, method, args, result });
				}
				return result;
			} catch (Throwable e) {
				//执行exception方法
				List<Method> exceptionMethods = getInterceptMethods(
						object.getClass().getSuperclass(), InterceptPoint.EXCEPTION);
				for (Method m : exceptionMethods) {
					m.invoke(null, new Object[] { object, method, args, e });
				}
				throw e;
			}
		}
	}

	/**
	 * 如果类型cls不需要增强，则直接调用cls.newInstance()，否则使用cglib创建动态代理，
	 * callback为AspectInterceptor
	 * @param cls
	 * @param <T>
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private static <T> T createInstance(Class<T> cls) 
			throws InstantiationException, IllegalAccessException {
		if (!interceptMethodsMap.containsKey(cls)) {
			return (T) cls.newInstance();
		}
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(cls);
		enhancer.setCallback(new AspectInterceptor());
		return (T) enhancer.create();
	}

	/**
	 * getInstance方法调用createInstance创建实例
	 * @param cls
	 * @param <T>
	 * @return
	 */
	public static <T> T getInstance(Class<T> cls) {
		try {
			T obj = createInstance(cls);
			Field[] fields = cls.getDeclaredFields();
			for (Field f : fields) {
				if (f.isAnnotationPresent(SimpleInject.class)) {
					if (!f.isAccessible()) {
						f.setAccessible(true);
					}
					Class<?> fieldCls = f.getType();
					f.set(obj, getInstance(fieldCls));
				}
			}
			return obj;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
