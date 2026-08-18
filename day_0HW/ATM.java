package day_0HW;

import java.util.*;

public class ATM {

    String name;
    int age;
    String designation;

    void createAccount() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your name: ");
            name = sc.nextLine();

            System.out.print("Enter your age: ");
            age = sc.nextInt();
            sc.nextLine();

            while (true) {

                System.out.print("Enter your designation: ");
                designation = sc.nextLine();

                switch (designation) {

                    case "Programmer":
                    case "Manager":
                    case "Tester":
                        break;

                    default:
                        System.out.println("Invalid designation. Try again.");
                        continue;
                }

                break;
            }

            System.out.println("\n----- Account Details -----");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);

            System.out.print("\nDo you want to change the details? (Y/N): ");
            char choice = sc.next().charAt(0);
            sc.nextLine();

            if (choice == 'Y' || choice == 'y') {
                System.out.println("\nPlease enter the details again.\n");
            }
            else if (choice == 'N' || choice == 'n') {
                System.out.println("\nAccount created successfully!");
                break;
            }
        }
    }

    public static void main(String[] args) {

        ATM atm = new ATM();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== ATM =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Withdraw/Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    atm.createAccount();
                    break;

                case 2:
                    System.out.println("Display - To-do");
                    break;

                case 3:
                    System.out.println("Withdraw/Deposit - To-do");
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}