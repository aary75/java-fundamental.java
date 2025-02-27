// finding the area of circle

import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);    // declaring scanner class for taking input 

      double pi = 3.14;

      System.out.print("Enter the radius of circle in cm ");
      int radiusOfCircle = scanner.nextInt();

      double areaOfCircle = pi *  Math.pow(radiusOfCircle,2);

      System.out.print("Area of Cicle is "+areaOfCircle +"cm^2");

}}
