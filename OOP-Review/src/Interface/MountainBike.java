package Interface;

public class MountainBike implements Bicycle{

    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int startHeight, int startSpeed, int startGear){
        this.seatHeight = startHeight;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public int getHeight(){
        return seatHeight;
    }

    public int getGear(){
        return gear;
    }

    public int getSpeed(){
        return speed;
    }

    public void setHeight(int height){
        this.seatHeight = height;
    }

    public void setGear(int gear){
        this.gear = gear;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement){
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment){
        this.speed += increment;
    }
}
