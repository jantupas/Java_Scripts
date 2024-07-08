package Inheritance;

public class Student extends Person{
    protected int year;

    public Student(String name, int age, int year){
        super(name, age);
        this.year = year;
    }

    public void greeting(){
        System.out.println("Hi I'm " + name + " my age is " + age + " and my year level is " + year);
    }
}
