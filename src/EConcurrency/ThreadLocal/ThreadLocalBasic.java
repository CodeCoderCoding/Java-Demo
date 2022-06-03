package EConcurrency.ThreadLocal;

/**
 * ThreadLocal基本使用
 */
public class ThreadLocalBasic {
	static ThreadLocal<Integer> local = new ThreadLocal<>();

	public static void main(String[] args) throws InterruptedException {
		Thread child = new Thread() {
			@Override
			public void run() {
				System.out.println("子线程初始值: " + local.get());
				local.set(200);
				System.out.println("子线程最终值: " + local.get());
			}
		};
		local.set(100);
		child.start();
		child.join();
		System.out.println("主线程最终值: " + local.get());
	}
}
