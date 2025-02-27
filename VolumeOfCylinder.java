// finding the volume of cylinder
import java.util.Scanner;

public class VolumeOfCylinder{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     double pi = 3.14;
     
     System.out.print("Enter the raduis of cylinder in cm ");
     double radiusOfCylinder = scanner.nextDouble();      // getting the value of raduis of cylinder

     System.out.print("Enter the height of cylinder in cm "); // getting the value of height of cylinder
     double heightOfCylinder = scanner.nextDouble();

     double volumeOfCylinder = pi * Math.pow(radiusOfCylinder,2) * heightOfCylinder; // finding the volume of cylinder

     System.out.print("Volume of cylinder is "+volumeOfCylinder+"cm^3");  //printing the volume of cylinder
}}
