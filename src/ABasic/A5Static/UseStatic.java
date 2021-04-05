package ABasic.A5Static;

/**
 * @author supremepole
 */
public class UseStatic {
    private double d;

    public String toString(){
        return ""+d;
    }


    public static void main(String[] args) {
        String string=test();
        UseStatic useStatic=new UseStatic();
        System.out.println(useStatic);
    }
    public static String test(){
        return "Hello World!";
    }
}
