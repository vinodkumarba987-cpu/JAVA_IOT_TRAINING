import java.util.Scanner;

public class Recurrsion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the symbol to use : ");
        String symbol = sc.next();
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= (rows - i); space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
