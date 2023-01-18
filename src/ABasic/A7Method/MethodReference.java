package ABasic.A7Method;

public class MethodReference {
    public static void main(String[] args) {
        Person person=new Person("name", 18, "black");
        // person1还是person1，hashCode相同
        Person person1=new Person("name1", 19);
        System.out.println(person1.toString());
        copyAttribute(person, person1);
        System.out.println(person1.toString());
        // person2发生了变化，hashCode不同
        Person person2=new Person("name2", 20);
        System.out.println(person2.toString());
        person2=copyAttribute2();
        System.out.println(person2);
        person2=copyAttribute3();
        System.out.println(person2);
    }

    public static void copyAttribute(Person person, Person person1){
        person1.setEyeColor(person.getEyeColor());
    }

    public static Person copyAttribute2(){
        Person person=new Person("name", 20, "red");
        return person;
    }

    public static Person copyAttribute3(){
        Person person=new Person("name", 20, "blue");
        return person;
    }

}
