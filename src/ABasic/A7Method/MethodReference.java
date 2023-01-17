package ABasic.A7Method;

public class MethodReference {
    public static void main(String[] args) {
        Person person=new Person("name", 18, "black");
        Person person1=new Person("name1", 19);
        System.out.println(person1.toString());
        copyAttribute(person, person1);
        System.out.println(person1.toString());
    }

    public static void copyAttribute(Person person, Person person1){
        person1.setEyeColor(person.getEyeColor());
    }

}
