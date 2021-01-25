package B.OOP;

/**
 *
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;

    public Person(String name, int age, String eyeColor){
        this.name=name;
        this.age=age;
        this.eyeColor=eyeColor;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
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
        String string="name: "+name+"age: "+age;
        return string;
    }
}
