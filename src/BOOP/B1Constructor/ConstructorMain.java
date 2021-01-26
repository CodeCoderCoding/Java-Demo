package BOOP.B1Constructor;

public class ConstructorMain {
    public static void main(String[] args){
        Person person=new Person("name", 24, "black");
        System.out.println(person);

        Person person2=new Person("name", 24);//此处会调用重载的构造方法
        System.out.println(person2);

        PersonNoConstructor personNoConstructor=new PersonNoConstructor();//此处会调用Java编译器生成的构造方法
        System.out.println(personNoConstructor);
    }
}
