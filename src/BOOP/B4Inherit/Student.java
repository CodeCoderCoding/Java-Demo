package BOOP.B4Inherit;

public class Student extends Person{
    private String major;

    public Student(String name, int age, String major){
        super(name, age);
        this.major=major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
