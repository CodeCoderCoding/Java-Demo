package FDynamic.Proxy.CGLib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDynamicDemo {
    static class RealService {
        public void HelloWorld() {
            System.out.println("helloWorld");
        }
    }

    static class SimpleInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object object, Method method,
                Object[] args, MethodProxy proxy) throws Throwable {
            Object result = proxy.invokeSuper(object, args);
            return result;
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T getProxy(Class<T> cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new SimpleInterceptor());
        return (T) enhancer.create();
    }

    public static void main(String[] args) throws Exception {
        RealService proxyService = getProxy(RealService.class);
        proxyService.HelloWorld();
    }
}