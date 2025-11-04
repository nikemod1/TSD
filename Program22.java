import java.util.Scanner;

public class Program22_BankAccount {
   private double balance;

   public Program22_BankAccount(double var1) {
      this.balance = var1;
   }

   public void deposit(double var1) {
      this.balance += var1;
   }

   public boolean withdraw(double var1) {
      if (var1 > this.balance) {
         return false;
      } else {
         this.balance -= var1;
         return true;
      }
   }

   public double getBalance() {
      return this.balance;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Program22_BankAccount var2 = new Program22_BankAccount(0.0);
      System.out.println("Initial balance: " + var2.getBalance());
      System.out.print("Deposit amount: ");
      var2.deposit(var1.nextDouble());
      System.out.print("Withdraw amount: ");
      double var3 = var1.nextDouble();
      if (var2.withdraw(var3)) {
         System.out.println("Withdrawn " + var3);
      } else {
         System.out.println("Insufficient funds.");
      }

      System.out.println("Final balance: " + var2.getBalance());
      var1.close();
   }
}
