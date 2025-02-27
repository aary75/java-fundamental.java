//calculating the perimeter of rectangle
import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.print("Length of rectangle: ");
         double lengthOfRectangle = scanner.nextDouble(); // getting the length of rectangle

         System.out.print("Breadth of rectangle: ");
         double breadthOfRectangle = scanner.nextDouble(); // getting the breadth of rectangle

         double perimeterOfRectangle = 2 * (lengthOfRectangle + breadthOfRectangle);  // calculating the perimeter of rectangle

         System.out.print("Perimeter of rectangle is: "+ perimeterOfRectangle); // printing the perimeter of rectangle
}}
