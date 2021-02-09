package CException;

public class TestFinally {

    public static void main(String[] args){
        //System.out.println(testFinally1());
        System.out.println();
        //System.out.println(testFinally2());
        System.out.println();
        int result=testFinally3();//return

        //System.out.println(result);
        System.out.println();
        System.out.println(testFinally4());

    }

    public static String testFinally1(){
        try{
            return "try语句块被执行";
        }catch(Exception e){
            return "catch语句块被执行";
        }finally{
            System.out.println("finally语句块被执行");
        }
    }

    public static String testFinally2(){
        try{
            return "try语句块被执行";
        }catch(Exception e){
            return "catch语句块被执行";
        }finally{//'finally' block can not complete normally
            System.out.println("finally语句块被执行");
            return "finally return语句被执行";
        }
    }

    public static int testFinally3(){
        int number=1;
        try{
            number=2;
            return number;//return的返回值先存储在某个地方，等方法执行完后再赋值
        }catch(Exception e){
            return 0;
        }finally{
            number=3;
            System.out.println("finally语句块被执行");
        }
    }

    public static String testFinally4(){
        String string="Hello";
        String string1=new String("Hello");
        try{
            return string;//这里是引用，
        }catch(Exception e){
            return null;
        }finally{
            string+="World";
            System.out.println("finally语句块被执行");
        }
    }
}
