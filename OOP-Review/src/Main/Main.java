package Main;
import OOPBasic.Student;
//import access_modifiers.Test;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jan", 22, "Makati City");

        String myName = student.getName();
        int myAge = student.getAge();
        String myAddress = student.getAddress();
        String myIntro = student.toString();

        //System.out.println(myIntro);
        // testing access modifiers and methods in it
        //Test t = new Test();
        //t.display();
    }
}