import java.util.Scanner;

public class Program23 {
   String name;
   int id;
   double basic;

   public Program23() {
   }

   public void empDetails(Scanner var1) {
      System.out.print("Enter id: ");
      this.id = var1.nextInt();
      var1.nextLine();
      System.out.print("Enter name: ");
      this.name = var1.nextLine();
      System.out.print("Enter basic salary: ");
      this.basic = var1.nextDouble();
   }

   public double salary() {
      return this.basic + 0.2 * this.basic + 0.1 * this.basic;
   }

   public void total() {
      System.out.println("Employee ID: " + this.id);
      System.out.println("Name: " + this.name);
      System.out.printf("Total salary: %.2f%n", this.salary());
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Program23 var2 = new Program23();
      var2.empDetails(var1);
      var2.total();
      var1.close();
   }
}
