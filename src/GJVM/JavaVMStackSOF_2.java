package GJVM;

/**
 * VM Args：-Xss128k
 * @author zzm 来自周志明老师的《深入理解Java虚拟机》一书
 */
public class JavaVMStackSOF_2 {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF_2 oom = new JavaVMStackSOF_2();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
