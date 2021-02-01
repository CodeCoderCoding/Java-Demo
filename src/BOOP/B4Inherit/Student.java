package BOOP.B4Inherit;

public class Student extends Person{
    private double gpa;

    public Student(String name, int age, double gpa){
        super(name, age);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
