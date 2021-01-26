package BOOP.B3Equal;

public class EqualMain {
    public static void main(String[] args){
        String string1="Hello World!";
        String string2="Hello World!";
        System.out.println(string1==string2);//true
        System.out.println(string1.equals(string2));//true

        Person person1=new Person("name",24);
        Person person2=new Person("name",24);
        Person person3=person1;
        System.out.println(person1==person2);//false
        System.out.println(person1.equals(person2));//false
        System.out.println(person1==person3);
        System.out.println(person1.equals(person3));
    }
}
