// Calculate simple interest
import java.util.Scanner;

public class CalculateSimpleInterest{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the principal value: "); 
      int principal = scanner.nextInt();  // getting the principal value

       System.out.print("Enter the rate value; ");
       int rate = scanner.nextInt(); // getting the rate value

      System.out.print("Enter the time taken: ");
      int time = scanner.nextInt(); // getting the time period

      int simpleInterest = (principal * rate * time)/2;  // calculating the simple interest
      
      System.out.print("Simple Interest is: " + simpleInterest);  // printing the value of simpleInterst
}}

