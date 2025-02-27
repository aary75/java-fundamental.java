import java.util.Scanner;

public class AdditionOfNumbers{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number:");
        int secondNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;

        System.out.print("Addition of first and second number is:" + sumOfNumbers);
}}
