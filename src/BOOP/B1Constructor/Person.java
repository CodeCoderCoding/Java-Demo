package BOOP.B1Constructor;

/**
 *学习构造方法的重载
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private static int static_one=1;//赋值1、可以在定义变量的同时就赋值，对于非静态变量也适用
    private static int static_tow;
    static
    {
        static_tow=2;//赋值2、也可以将代码放入初始化代码块中，代码块中{}包围，对于非静态变量也适用
    }

    /**
     * 构造方法具有两个特性：①名称是固定的，与类名相同； ②没有返回值，也不能有返回值
     * @param name
     * @param age
     * @param eyeColor
     */
    public Person(String name, int age, String eyeColor){
        this.name=name;
        this.age=age;
        this.eyeColor=eyeColor;
    }

    /**
     * 构造方法的重载
     * @param name
     * @param age
     */
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    /**
     * 构造方法的重载
     * @param name
     */
    public Person(String name){
        this(name,24,"black");//这个this指向第一个Person构造方法
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    /**
     * 重载Object的toString()方法
     */
    public String toString() {
        String string="name: "+name+", age: "+age;
        return string;
    }
}
