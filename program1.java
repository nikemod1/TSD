import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = input.nextLine();
    System.out.println("Enter your age");
    int age = input.nextInt();
    System.out.println("Welcome, " + name);
    }
}
