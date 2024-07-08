package Polymorphism;

public class Dog extends AnimalSounds{
    public void sound(){
        System.out.println("dog says: bark bark");
    }
    public void sound(String angry){
        System.out.println("dog says: growl growl");
        super.sound();
    }
}
