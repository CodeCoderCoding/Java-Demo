package EConcurrency.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo2 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger=new AtomicInteger();
        for(int i=0;i<10;i++){
            System.out.println(atomicInteger.getAndIncrement());
        }
    }

}
