//Calculating the power of base
import java.util.Scanner;

public class PowerCalculation{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the base: ");
       double base = scanner.nextDouble(); // getting the value of base

      System.out.print("Enter the exponent: ");
      double exponent = scanner.nextDouble(); // getting the value of exponent

      double powerOfBase = Math.pow(base,exponent);  // calculating the power of base to exponent
      System.out.print("Power of " + base + " to "+ exponent +" is " + powerOfBase);  // printing the power
}}
