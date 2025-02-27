//Convert From Kilometre to Miles
import java.util.Scanner;

public class KilometerToMiles{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the kilometers: ");
       int kilometers = scanner.nextInt();

       double miles = kilometers * 0.621371;
       System.out.print("Kilometes in Miles: " + miles);
}}
