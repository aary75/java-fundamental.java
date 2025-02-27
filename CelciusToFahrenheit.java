// changing the temperature value from celcius to farhenheit
import java.util.Scanner;

public class CelciusToFahrenheit{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the temperature value in celcius;");
      int celcius = scanner.nextInt();   // taking the temperature value in celcius

      double fahrenheit = ( celcius * 9.0/5) + 32; // changing the temperature value from celcuis to fahrenheit with formula

       System.out.print("Temperature value in fahrenheit:" + fahrenheit);
}}
