package ABasic.A4String;

/**
 * @author supremepole
 */
public class StringEqual {
    public static void main(String[] args) {
        String string1="string";
        String string2="string";
        System.out.println(string1==string2);//true
        System.out.println(string1.equals(string2));//true
        String string3=new String("string");
        String string4=new String("string");
        System.out.println(string3==string4);//false
        System.out.println(string3.equals(string4));//true
    }
}
