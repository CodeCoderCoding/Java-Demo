package FDynamic.Proxy.Static;

/**
 * 静态代理demo
 */
public class StaticProxyDemo {

    //代理类和实际类共同实现的接口
    static interface IService {
        public void HelloWorld();
    }

    static class RealService implements IService {

        @Override
        public void HelloWorld() {
            System.out.println("hello");
        }
    }

    static class ProxyService implements IService {
        private IService realService;

        public ProxyService(IService realService) {
            this.realService = realService;
        }

        @Override
        public void HelloWorld() {
            System.out.println("HelloWorld之前");
            this.realService.HelloWorld();
            System.out.println("HelloWorld之后");
        }
    }

    public static void main(String[] args) {
        IService realService = new RealService();
        IService proxyService = new ProxyService(realService);
        proxyService.HelloWorld();
    }
}
