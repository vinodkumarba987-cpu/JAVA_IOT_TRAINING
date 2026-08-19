import java.util.Scanner;

public class ATM {

    String name;
    int age;
    String designation;
    double salary;
    boolean accountCreated = false; // To check if account exists

    Scanner sc = new Scanner(System.in);

    // Create account method
    void createAccount() {
        System.out.print("Enter your name: ");
        name = sc.nextLine().trim();

        // Age validation
        while (true) {
            System.out.print("Enter your age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine(); // consume newline
                if (age > 18 && age < 60) {
                    break;
                } else {
                    System.out.println("Invalid age. Age must be more than 18 and less than 60. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for age.");
                sc.nextLine(); // clear invalid input
            }
        }

        // Designation validation + Salary assignment
        while (true) {
            System.out.print("Enter your designation (Programmer / Manager / Tester): ");
            designation = sc.nextLine().trim();

            switch (designation) {
                case "Programmer":
                    salary = 20000;
                    break;
                case "Manager":
                    salary = 25000;
                    break;
                case "Tester":
                    salary = 15000;
                    break;
                default:
                    System.out.println("Invalid designation. Try again.");
                    continue;
            }
            break;
        }

        accountCreated = true;
        System.out.println("\nAccount created successfully!\n");
    }

    // Display account details
    void displayAccount() {
        if (!accountCreated) {
            System.out.println("No account found. Please create an account first.\n");
            return;
        }
        System.out.println("\n----- Account Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Salary     : $" + salary);
        System.out.println("Designation: " + designation);
        System.out.println("---------------------------\n");
    }

    // Raise salary method (simple version)
    void raiseSalary() {
        if (!accountCreated) {
            System.out.println("No account found. Please create an account first.\n");
            return;
        }
        System.out.print("Enter raise amount: ");
        if (sc.hasNextDouble()) {
            double raise = sc.nextDouble();
            sc.nextLine(); // consume newline
            if (raise > 0) {
                salary += raise;
                System.out.println("Salary raised successfully! New Salary: $" + salary + "\n");
            } else {
                System.out.println("Raise amount must be positive.\n");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.\n");
            sc.nextLine(); // clear invalid input
        }
    }

    // Menu method
    void menu() {
        while (true) {
            System.out.println("===== ATM Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
            } else {
                System.out.println("Invalid input. Please enter a number.\n");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    displayAccount();
                    break;
                case 3:
                    raiseSalary();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.menu();
    }
}
