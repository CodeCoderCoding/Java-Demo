package BOOP.B2Reference;

public class ReferenceMain {
    public static void main(String[] args) {
        String b="Hel";
        String a=b;//a的值为Hel，“Hel"为不可变对象，当试图改变它时会创建一个新的对象
        b +="lo";//b的值为Hello，创建了一个新的对象"Hello"
        System.out.println(a);//Hel
        System.out.println(b);//Hello

        Person person1=new Person("name",24);
        Person person2=person1;//对象引用person1和person2引用同一个对象
        System.out.println(person1==person2);//true
        person1.setName("nameChanged");//person1为可变对象，当试图更改person1的属性时，并不会创建一个新的对象
        System.out.println(person1==person2);//true

        Person person3=new Person("name",24);
        Person person4=new Person("name",24);
        System.out.println(person3==person4);//false，因为person3与person4引用不同的对象
    }
}
