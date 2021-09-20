package FDynamic.Annotation.DI;

public class ServiceA {

	@SimpleInject
	ServiceB b;

	public void callB(){
		b.action();
	}

	public ServiceB getB() {
		return b;
	}
	
	
}
