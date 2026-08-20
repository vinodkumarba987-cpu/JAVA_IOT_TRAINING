import java.util.Scanner;

public class ReverseAndSumSwitch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                return;
            }

            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a number greater than 0.");
                return;
            }

            while (true) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Print numbers from " + n + " to 1");
                System.out.println("2. Show sum of numbers from 1 to " + n);
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                if (!sc.hasNextByte()) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next();
                    continue;
                }

                byte choice = sc.nextByte();

                switch (choice) {
                    case 1 : {
                        System.out.println("Numbers from " + n + " to 1:");
                        for (int i = n; i >= 1; i--) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    case 2 :{
                        int sum = n * (n + 1) / 2;
                        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
                    }
                    case 0 :{
                        System.out.println("Exiting program...");
                        return;
                    }
                    default : System.out.println("Invalid choice! Please enter 0, 1, or 2.");
                }
            }
        }
    }
}
