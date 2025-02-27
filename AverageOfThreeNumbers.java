//Calculate the average of three numbers
import java.util.Scanner;

public class AverageOfThreeNumbers{
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter first number: ");
       int firstNumber = scanner.nextInt();

       System.out.print("Enter second number: ");
       int secondNumber = scanner.nextInt();

       System.out.print("Enter third number:; ");
       int thirdNumber = scanner.nextInt();

       int average = (firstNumber + secondNumber + thirdNumber) / 3;
       System.out.print("Average of " +firstNumber +", " + secondNumber +", " + thirdNumber + " is " + average);
}}
