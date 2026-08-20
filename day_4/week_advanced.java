import java.util.Scanner;

public class week_advanced {
    public static void main(String[] args) {
        // Predefined array for days of the week (index 0 unused for simplicity)
        String[] days = {
            "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        try (Scanner sc = new Scanner(System.in)) { // Auto-close scanner
            while (true) {
                System.out.print("Enter a number (1-7) or 0 to exit: ");
                
                if (!sc.hasNextByte()) { // Input validation
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // Clear invalid input
                    continue;
                }

                byte choice = sc.nextByte();

                if (choice == 0) { // Exit condition
                    System.out.println("Exiting program...");
                    break;
                }

                // O(1) lookup in array
                if (choice >= 1 && choice <= 7) {
                    System.out.println(days[choice]);
                } else {
                    System.out.println("Invalid choice! Please enter between 1 and 7.");
                }
            }
        }
    }
}
