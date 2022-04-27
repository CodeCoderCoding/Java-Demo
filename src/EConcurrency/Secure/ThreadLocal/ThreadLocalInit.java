package EConcurrency.Secure.ThreadLocal;

public class ThreadLocalInit {
	static ThreadLocal<Integer> local = new ThreadLocal<Integer>(){

		@Override
		protected Integer initialValue() {
			return 100;
		}
	};

	public static void main(String[] args) {
		System.out.println("初始值："+local.get());
		local.set(200);
		System.out.println("调用local.set()之后的值："+local.get());
		//remove删掉当前线程对应的值后，如果再次调用get，会再调用initialValue获取初始值
		local.remove();
		System.out.println("调用local.remove()之后的值："+local.get());
	}
}
