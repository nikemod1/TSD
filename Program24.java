import java.util.Scanner;

public class Program24 {
   public Program24() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter marks for subject1: ");
      int var2 = var1.nextInt();
      System.out.print("Enter marks for subject2: ");
      int var3 = var1.nextInt();
      System.out.print("Enter marks for subject3: ");
      int var4 = var1.nextInt();
      int var5 = var2 + var3 + var4;
      double var6 = (double)var5 / 3.0;
      System.out.println("Total=" + var5 + " Percentage=" + String.format("%.2f", var6));
      System.out.println(var6 >= 40.0 ? "Pass" : "Fail");
      var1.close();
   }
}
