package EConcurrency.CreateThread;

public class ExtThread extends Thread{
    @Override
    public void run(){
        System.out.println("通过继承Thread类创建线程");
    }
}
