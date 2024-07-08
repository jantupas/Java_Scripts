package Interface;

public class InterfaceDemo {

    public static void main(String[] args){

        MountainBike mountainBike = new MountainBike(20, 10, 1);

        System.out.println("Gear: " + mountainBike.getGear());
        System.out.println("Height: " + mountainBike.getHeight());
        System.out.println("Speed: " + mountainBike.getSpeed());

        mountainBike.applyBrake(5);
        System.out.println("Speed: " + mountainBike.getSpeed());

        mountainBike.speedUp(7);
        System.out.println("Speed: " + mountainBike.getSpeed());

        Circle circle = new Circle();
        double circlePerm = circle.calculatePerimeter();
        double circleAr = circle.calculateArea();

        System.out.println("Circle -- perimeter: " + String.format("%.2f", circlePerm) + " Area: " + String.format("%.2f", circleAr));

        Rectangle rectangle = new Rectangle();
        double rectPerm = rectangle.calculatePerimeter();
        double rectAr = rectangle.calculateArea();
        
        System.out.println("Rectangle -- preimeter: " + String.format("%.2f", rectPerm) + " Area: " + String.format("%.2f", rectAr));
    }
}
