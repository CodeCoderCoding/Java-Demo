package B.OOP;

public class UsePerson {
    public static void main(){
        Person person=new Person("name", 24, "black");
        System.out.println(person);

        Person person2=new Person("name", 24);
        System.out.println(person2);
    }
}
