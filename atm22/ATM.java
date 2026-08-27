import java.util.ArrayList;
import java.util.Scanner;

class Account {

    String name;
    int age;
    String designation;
    double salary;

    Account(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

public class ATM {

    private Scanner sc = new Scanner(System.in);

    // Stores multiple accounts
    private ArrayList<Account> accounts = new ArrayList<>();

    // Create Account
    void createAccount() {

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Age validation
        int age;

        while (true) {

            System.out.print("Enter your age (19-59): ");

            if (sc.hasNextInt()) {

                age = sc.nextInt();
                sc.nextLine();

                if (age >= 19 && age <= 59)
                    break;

                System.out.println("Age must be between 19 and 59.");

            } else {

                System.out.println("Invalid age.");
                sc.nextLine();
            }
        }

        // Designation
        String designation;
        double salary;

        while (true) {

            System.out.print("Enter designation (Programmer / Manager / Tester): ");
            designation = sc.nextLine().trim();

            if (designation.equalsIgnoreCase("Programmer")) {
                designation = "Programmer";
                salary = 20000;
            }
            else if (designation.equalsIgnoreCase("Manager")) {
                designation = "Manager";
                salary = 25000;
            }
            else if (designation.equalsIgnoreCase("Tester")) {
                designation = "Tester";
                salary = 15000;
            }
            else {
                System.out.println("Invalid designation.");
                continue;
            }

            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);

            System.out.print("Do you want to re-enter designation? (y/n): ");
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("n"))
                break;

            if (!choice.equalsIgnoreCase("y"))
                System.out.println("Please enter y or n.");
        }

        // Create new account object
        Account account = new Account(name, age, designation, salary);

        // Add account to ArrayList
        accounts.add(account);

        System.out.println("\nAccount created successfully!\n");
    }

    // Display all accounts
    void displayAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts found.\n");
            return;
        }

        System.out.println("\n===== All Accounts =====");

        for (int i = 0; i < accounts.size(); i++) {

            Account account = accounts.get(i);

            System.out.println("\n--- Account " + (i + 1) + " ---");
            System.out.println("Name       : " + account.name);
            System.out.println("Age        : " + account.age);
            System.out.println("Designation: " + account.designation);
            System.out.printf("Salary     : %.2f%n", account.salary);
        }

        System.out.println("------------------------\n");
    }

    // Raise salary
    void raiseSalary() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts found. Create an account first.\n");
            return;
        }

        displayAccounts();

        System.out.print("Enter account number to raise salary: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid account number.\n");
            sc.nextLine();
            return;
        }

        int accountNumber = sc.nextInt();
        sc.nextLine();

        if (accountNumber < 1 || accountNumber > accounts.size()) {
            System.out.println("Invalid account number.\n");
            return;
        }

        Account account = accounts.get(accountNumber - 1);

        while (true) {

            System.out.print("Enter salary increase percentage (1-10): ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid percentage.");
                sc.nextLine();
                continue;
            }

            double percent = sc.nextDouble();
            sc.nextLine();

            if (percent < 1 || percent > 10) {
                System.out.println("Percentage must be between 1 and 10.");
                continue;
            }

            double newSalary =
                    account.salary + (account.salary * percent / 100);

            System.out.printf("Old Salary: %.2f%n", account.salary);
            System.out.printf("New Salary: %.2f%n", newSalary);

            System.out.print("Do you want to apply this salary increase? (y/n): ");
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("y")) {

                account.salary = newSalary;

                System.out.println("Salary increased successfully!\n");
                break;

            } else if (choice.equalsIgnoreCase("n")) {

                System.out.println("Salary increase cancelled.\n");
                break;

            } else {

                System.out.println("Please enter y or n.");
            }
        }
    }

    // Main menu
    public static void main(String[] args) {

        ATM atm = new ATM();

        while (true) {

            System.out.println("===== ATM Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            if (!atm.sc.hasNextInt()) {
                System.out.println("Invalid input!\n");
                atm.sc.nextLine();
                continue;
            }

            int choice = atm.sc.nextInt();
            atm.sc.nextLine();

            switch (choice) {

                case 1:
                    atm.createAccount();
                    break;

                case 2:
                    atm.displayAccounts();
                    break;

                case 3:
                    atm.raiseSalary();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM system!");
                    atm.sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}