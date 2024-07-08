package Interface;

import java.util.*;

public class Circle implements Shape{
    double pi = 3.14;



    @Override
    public double calculatePerimeter(){
        System.out.println("Enter radius: ");
        Scanner snr = new Scanner(System.in);
        double radius = Double.parseDouble(snr.nextLine());

        return 2*pi*radius;
    }

    public double calculateArea(){
        System.out.println("Enter radius: ");
        Scanner snr = new Scanner(System.in);
        double radius = Double.parseDouble(snr.nextLine());

        return pi*(Math.pow(radius, 2));
    }

}
