package ABasic.A7Method;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private Date birthday;

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

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 重载Object的toString()方法
     */
    @Override
    public String toString() {
        String string="hashCode: "+hashCode()+", name: "+name+", age: "+age+", eyeColor: "+eyeColor;
        return string;
    }
}
