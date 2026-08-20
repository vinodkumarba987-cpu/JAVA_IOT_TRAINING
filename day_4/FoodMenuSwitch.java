import java.util.Scanner;

public class FoodMenuSwitch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Auto-close scanner
            while (true) {
                System.out.println("\n--- Food Menu ---");
                System.out.println("1. Pasta");
                System.out.println("2. Pizza");
                System.out.println("3. Burger");
                System.out.println("4. French Fries");
                System.out.println("5. Sandwich");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                if (!sc.hasNextByte()) { // Validate numeric input
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // Clear invalid input
                    continue;
                }

                byte choice = sc.nextByte();

                switch (choice) {
                    case 1 -> System.out.println("You Ordered: Pasta");
                    case 2 -> System.out.println("You Ordered: Pizza");
                    case 3 -> System.out.println("You Ordered: Burger");
                    case 4 -> System.out.println("You Ordered: French Fries");
                    case 5 -> System.out.println("You Ordered: Sandwich");
                    case 0 -> {
                        System.out.println("Exiting menu...");
                        return; // Exit program
                    }
                    default -> System.out.println("Invalid choice! Please enter between 0 and 5.");
                }
            }
        }
    }
}
