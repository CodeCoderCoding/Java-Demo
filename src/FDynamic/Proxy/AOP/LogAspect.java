package FDynamic.Proxy.AOP;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * LogAspect就是一个切面，负责ServiceA和ServiceB的日志切面，即为这两个类增加日志功能
 */
@Aspect({ ServiceA.class, ServiceB.class })
public class LogAspect {

	public static void before(Object object, Method method, Object[] args) {
		System.out.println("entering " + method.getDeclaringClass().getSimpleName() 
				+ "::" + method.getName() + ", args: " + Arrays.toString(args));
	}

	public static void after(Object object, Method method, Object[] args, Object result) {
		System.out.println("leaving " + method.getDeclaringClass().getSimpleName() 
				+ "::" + method.getName() + ", result: " + result);
	}
}
