import java.util.Scanner;
public class program7 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number ");
       int number = input.nextInt();
       int reversed = 0;
       while (number != 0) {
            int digit = number % 10;    
            reversed = reversed * 10 + digit; 
            number = number / 10;       
        }
        System.out.println("Reversed number: " + reversed);
   } 
}
