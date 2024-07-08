package Inheritance;

//parent class
class Bicycle {

    //properties
    protected int gear;
    protected int speed;

    //constructor
    public Bicycle(int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int newValue){
        this.gear = newValue;
    }

    public void applyBreak(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }
}
