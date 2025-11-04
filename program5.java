import java.util.Scanner;
public class program5 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Year ");
       int num = input.nextInt();
       if (num%400==0 || (num%4 == 0 && num%100!=0)){
        System.out.print(num + " is a leap year");
       }else{
        System.err.println(num + " is not a leap year");
       }
   }
}