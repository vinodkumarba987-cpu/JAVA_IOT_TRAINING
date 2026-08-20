import java.util.Scanner;

public class ATM {

    private String name;
    private int age;
    private String designation;
    private double salary;
    private boolean accountCreated = false; // Tracks if account exists

    private final Scanner sc = new Scanner(System.in);

    // Method to create a new account with Y/N confirmation
    void createAccount() {
        while (true) {
            System.out.print("Enter your name: ");
            name = sc.nextLine().trim();

            // Age validation loop
            while (true) {
                System.out.print("Enter your age (19-59): ");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (age >= 19 && age <= 59) {
                        break;
                    } else {
                        System.out.println("❌ Age must be between 19 and 59. Try again.");
                    }
                } else {
                    System.out.println("❌ Invalid input. Please enter a valid number for age.");
                    sc.nextLine(); // clear invalid input
                }
            }

            // Designation validation + Salary assignment
            while (true) {
                System.out.print("Enter your designation (Programmer / Manager / Tester): ");
                designation = sc.nextLine().trim();

                if (designation.equalsIgnoreCase("Programmer")) {
                    salary = 20000;
                } else if (designation.equalsIgnoreCase("Manager")) {
                    salary = 25000;
                } else if (designation.equalsIgnoreCase("Tester")) {
                    salary = 15000;
                } else {
                    System.out.println("❌ Invalid designation. Please choose from Programmer, Manager, or Tester.");
                    continue;
                }
                break;
            }

            // Ask if user wants to re-enter details
            System.out.print("Do you want to re-enter details? (y/n): ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("y")) {
                System.out.println("\n🔄 Restarting account creation...\n");
                continue; // restart loop
            } else if (choice.equals("n")) {
                accountCreated = true;
                System.out.println("\n✅ Account created successfully!\n");
                break; // exit loop
            } else {
                System.out.println("⚠ Invalid choice. Assuming 'n'.");
                accountCreated = true;
                System.out.println("\n✅ Account created successfully!\n");
                break;
            }
        }
    }

    // Method to display account details
    void displayAccount() {
        if (!accountCreated) {
            System.out.println("⚠ No account found. Please create an account first.\n");
            return;
        }

        System.out.println("\n--- Account Details ---");
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Age        : %d%n", age);
        System.out.printf("Designation: %s%n", designation);
        System.out.printf("Salary     : %.2f%n", salary);
        System.out.println("-----------------------\n");
    }

    // Main menu
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== ATM Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.\n");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> atm.createAccount();
                case 2 -> atm.displayAccount();
                case 3 -> {
                    System.out.println("👋 Thank you for using the ATM system!");
                    sc.close();
                    return;
                }
                default -> System.out.println("❌ Invalid choice! Please try again.\n");
            }
        }
    }
}
