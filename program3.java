import java.util.Scanner;

public class program3 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Fahrenheit: ");
       float fahrenheit = input.nextInt();
       float celsius = (fahrenheit - 32) * 5/9;
       System.out.print("Celsius value is: " + celsius);
   } 
}
