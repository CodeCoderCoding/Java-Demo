package FDynamic.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author supremepole
 */
public class ReflectDemo {
    static class Person{

    }
    static class Student extends Person{

    }

    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Person();
        //1、获取Class对象
        //Class对象获取方式1：通过调用某个对象的getClass()方法以获取该类对应的Class对象
        Class cla1=person.getClass();
        //Class对象获取方式2：调用某个类的class属性以获取该类对应的Class对象
        Class cla2=Person.class;
        //Class对象获取方式3：调用Class类中的forName静态方法来获取该类对应的Class对象
        Class cla3=Class.forName("FDynamic.Reflect.ReflectDemo$Person");

        //2、获取 Person类的所有方法的信息
        Method[]method= cla3.getDeclaredMethods();
        for(Method m:method){
            System.out.println(m.toString());
        }
        //3、获取 Person类的所有成员的属性信息
        Field[] field= cla3.getDeclaredFields();
        for(Field f:field){
            System.out.println(f.toString());
        }
        //4、获取Person类的所有构造方法的信息
        Constructor[] constructor= cla3.getDeclaredConstructors();
        for(Constructor c:constructor){
                System.out.println(c.toString());
        }
    }
}
