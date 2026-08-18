import java.util.Scanner;
public class SumofallNumbers {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int n = scanner.nextInt();
       if (n <= 0) {
           System.out.println("Enter a positive integer :");
           return;
       }
       int sum = 0;
       for (int i = 1; i <= n; i++) {
           sum += i;
       }
       System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
   }
}