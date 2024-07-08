package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args){
        /*MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is " + mountainBike.gear);
        System.out.println("Seat height is " + mountainBike.seatHeight);
        System.out.println("Bike speed is " + mountainBike.speed);
        mountainBike.applyBreak(1);
        System.out.println("Bike speed after break is " + mountainBike.speed);*/

        Person person1 = new Person("Jan", 22);
        person1.greeting();

        Student stud1 = new Student("Jed", 23, 3);
        stud1.greeting();
    }
}
