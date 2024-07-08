package OOPBasic;

public class OOPBasicDemo {
    public static void main(String[] args){
        Employee jan = new Employee("Jan","Tupas",22);

        jan.greeting();

        String fname = jan.getFname();
        String lname = jan.getLname();
        int age = jan.getAge();
        System.out.println("First Name: " + fname + "\nLast Name: " + lname + "\nAge: " + age);

        jan.setAge(23);
        jan.setFname("Edgar");
        jan.setLname("Escriba");

        jan.greeting();

        String newFname = jan.getFname();
        String newLname = jan.getLname();
        int newAge = jan.getAge();
        System.out.println("First Name: " + newFname + "\nLast Name: " + newLname + "\nAge: " + newAge);

    }
}
