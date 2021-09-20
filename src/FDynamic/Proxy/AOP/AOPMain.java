package FDynamic.Proxy.AOP;


public class AOPMain {
	
	public static void main(String[] args) {
		
		ServiceA a = CGLibContainer.getInstance(ServiceA.class);
		a.callB();
		
	}
}
