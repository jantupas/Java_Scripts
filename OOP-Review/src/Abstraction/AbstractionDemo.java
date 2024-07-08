package Abstraction;

public class AbstractionDemo {
    public static void main(String[] args){
        GraphicObject circle1 = new Circle();
        circle1.draw();
        circle1.resize();

        GraphicObject rectangle1 = new Rectangle();
        rectangle1.draw();
        rectangle1.resize();

        Animal dog1 = new Dog("Datu", 2);
        dog1.makeSound();

        Animal cat1 = new Cat("Mocha", 5);
        cat1.makeSound();
    }
}
