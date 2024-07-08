package Inheritance;

public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greeting(){
        System.out.println("Hi I'm " + name + " and my age is " + age);
    }
}
