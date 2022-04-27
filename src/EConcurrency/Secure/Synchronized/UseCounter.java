package EConcurrency.Secure.Synchronized;

/**
 * @author CodeCoderCoding
 */
public class UseCounter extends Thread{
    Counter counter;

    public UseCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i= 0; i<1000; i++) {
            counter.incr();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Counter counter = new Counter();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new UseCounter(counter);
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        System.out.println(counter.getCount());
    }
}
