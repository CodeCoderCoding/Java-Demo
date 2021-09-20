package FDynamic.Proxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态打理
 */
public class JDKDynamicProxyDemo {

    static interface IService {
        public void HelloWorld();
    }

    static class RealService implements IService {

        @Override
        public void HelloWorld() {
            System.out.println("HelloWorld");
        }
    }

    static class MyInvocationHandler implements InvocationHandler {
        private Object realObj;

        public MyInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(realObj, args);
            return result;
        }
    }

    public static void main(String[] args) {
        IService realService = new RealService();
        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(),
                new Class<?>[] { IService.class }, new MyInvocationHandler(realService));
        proxyService.HelloWorld();
    }
}