package Interface;

import java.util.*;

public class Rectangle implements Shape{

    double pi = 3.14;

    @Override
    public double calculatePerimeter(){
        System.out.println("Enter radius: ");
        Scanner snr = new Scanner(System.in);
        double side = Double.parseDouble(snr.nextLine());

        return 4*side;
    }

    public double calculateArea(){
        System.out.println("Enter radius: ");
        Scanner snr = new Scanner(System.in);
        double side = Double.parseDouble(snr.nextLine());

        return Math.pow(side, 2);
    }
}
