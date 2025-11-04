import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number ");
    int number = input.nextInt();
    boolean flag = false;
    for(int i = 2; i<number; i++){
        if (number%i == 0){
            flag = true;
            System.out.println("Number is not prime");
            break;
        }else{
            flag = false;
        }
    }
    if (flag == false){
        System.out.print("Number is prime");
    }
    }
}
