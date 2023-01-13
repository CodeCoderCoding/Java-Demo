package ABasic.A6Boolean;

public class BooleanDemo {

    public static void main(String[] args) {
        boolean bool=test();
        // bool被装箱为Boolean
        if(Boolean.TRUE.equals(bool)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(bool){
            System.out.println("true");
        }
    }

    public static boolean test(){
        return true;
    }

}
