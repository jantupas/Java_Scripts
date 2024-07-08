package Polymorphism;

//many version of the sing method but prioritizes that of main class
public class PolyDemo {

    public static void main(String[] args){
        /*Bird bird1 = new Bird();
        bird1.sing();

        Robin robin1 = new Robin();
        robin1.sing();*/

        AnimalSounds animal = new AnimalSounds();
        animal.sound();

        Cow cow = new Cow();
        cow.sound();

        Dog dog = new Dog();
        dog.sound("angry");
    }
}
