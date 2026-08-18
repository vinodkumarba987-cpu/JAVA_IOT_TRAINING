import java.util.Scanner;

public class Recurrsion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of rows from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Take the symbol to print
        System.out.print("Enter the symbol to use (e.g., *): ");
        String symbol = sc.next();

        sc.close();

        // Loop for rows
        for (int i = 1; i <= rows; i++) {
            // Print spaces for left alignment
            for (int space = 1; space <= (rows - i); space++) {
                System.out.print("  "); // two spaces for better alignment
            }
            // Print symbols
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
