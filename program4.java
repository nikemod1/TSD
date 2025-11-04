import java.util.Scanner;

public class program4 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Priciple ");
    int P = input.nextInt();
    System.out.print("Enter Rate ");
    int R = input.nextInt();    
    System.out.print("Enter Time ");
    int T = input.nextInt();    
    System.out.print("Simple Interest is " + (P*R*T/100));
    } 
}
