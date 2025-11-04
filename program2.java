import java.util.Scanner;

public class program2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number ");
        int a = input.nextInt();
        System.out.print("enter another number ");
        int b = input.nextInt();
        input.nextLine();
        System.out.print("Enter an operation ");
        String operator = input.nextLine();
        if(operator.equals("+")){
            int c = a+b;
            System.out.println("Sum is: " + c);
        }
        else if(operator.equals("-")){
            int c = a-b;
            System.out.println("Difference is: " + c);
        }
        else if(operator.equals("/")){
            float c = (float) a/b;
            System.out.println("Division is: " + c);
        }
        else if(operator.equals("*")){
            int c = a*b;
            System.out.println("Multiplication is: " + c);
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}