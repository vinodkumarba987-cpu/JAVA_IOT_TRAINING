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

    Scanner sc = new Scanner(System.in);

    ArrayList<Account> accounts = new ArrayList<>();

    void createAccount() {

        String name;
        while (true) {

            System.out.print("Enter your name: ");
            name = sc.nextLine().trim();

            if (name.matches("[a-zA-Z ]+"))
                break;

            System.out.println("Invalid name! Please try again.");
        }
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

                System.out.println("Invalid age! Please try again.");
                sc.nextLine();
            }
        }

        String designation;
        double salary;

        while (true) {

            System.out.print(
                "Enter designation (Programmer / Manager / Tester): "
            );

            designation = sc.nextLine().trim();

            if (designation.equals("Programmer")) {

                designation = "Programmer";
                salary = 20000;

            } else if (designation.equals("Manager")) {

                designation = "Manager";
                salary = 25000;

            } else if (designation.equals("Tester")) {

                designation = "Tester";
                salary = 15000;

            } else {

                System.out.println("Invalid designation! Please try again.");
                continue;
            }
            while (true) {

                System.out.print(
                    "Do you want to re-enter designation? (y/n): "
                );

                String choice = sc.nextLine().trim();

                if (choice.equalsIgnoreCase("y")) {
                    break;
                }

                if (choice.equalsIgnoreCase("n")) {

                    Account account =
                        new Account(name, age, designation, salary);

                    accounts.add(account);

                    System.out.println(
                        "\nAccount created successfully!\n"
                    );

                    return;
                }

                System.out.println("Please enter y or n.");
            }
        }
    }
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

            System.out.printf(
                "Salary     : %.2f%n",
                account.salary
            );
        }

        System.out.println("------------------------\n");
    }
    void raiseSalary() {

        if (accounts.isEmpty()) {

            System.out.println(
                "No accounts found. Create an account first.\n"
            );

            return;
        }

        displayAccounts();

        System.out.print("Enter name to raise salary: ");
        String searchName = sc.nextLine().trim();

        Account account = null;
        for (int i = 0; i < accounts.size(); i++) {

            if (accounts.get(i).name.equalsIgnoreCase(searchName)) {

                account = accounts.get(i);
                break;
            }
        }

        if (account == null) {

            System.out.println("Name not found.\n");
            return;
        }
        while (true) {

            System.out.print(
                "Enter salary increase percentage (1-10): "
            );

            if (!sc.hasNextDouble()) {

                System.out.println(
                    "Invalid percentage! Please try again."
                );

                sc.nextLine();
                continue;
            }

            double percent = sc.nextDouble();
            sc.nextLine();

            if (percent < 1 || percent > 10) {

                System.out.println(
                    "Percentage must be between 1 and 10."
                );

                continue;
            }

            double newSalary =
                account.salary +
                (account.salary * percent / 100);

            System.out.printf(
                "Old Salary: %.2f%n",
                account.salary
            );

            System.out.printf(
                "New Salary: %.2f%n",
                newSalary
            );

            while (true) {

                System.out.print(
                    "Do you want to apply this salary increase? (y/n): "
                );

                String choice = sc.nextLine().trim();

                if (choice.equalsIgnoreCase("y")) {

                    account.salary = newSalary;

                    System.out.println(
                        "Salary increased successfully!\n"
                    );

                    return;
                }

                if (choice.equalsIgnoreCase("n")) {

                    System.out.println(
                        "Salary increase cancelled.\n"
                    );

                    return;
                }

                System.out.println("Please enter y or n.");
            }
        }
    }
    public static void main(String[] args) {

        ATM atm = new ATM();

        while (true) {

            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            if (!atm.sc.hasNextInt()) {

                System.out.println("Invalid input! Please try again.");
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
                    System.out.println(
                        "Thank you for using the ATM system!"
                    );

                    atm.sc.close();
                    return;

                default:
                    System.out.println(
                        "Please choose only options 1-4."
                    );
            }
        }
    }
}