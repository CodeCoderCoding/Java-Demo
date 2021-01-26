package BOOP.B1Constructor;

/**
 * 每个类都至少要有一个构造方法，在通过new创建对象的过程中会被调用。
 * 但构造方法如果没什么操作要做，可以省略。
 * 此类没有自定义构造方法，那么Java编译器会自动生成一个默认构造方法，也没有具体操作。
 */
public class PersonNoConstructor {
    private String name;
    private int age;
    private String eyeColor;

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
