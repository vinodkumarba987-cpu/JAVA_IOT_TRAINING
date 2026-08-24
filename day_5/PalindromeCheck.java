
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String original = sc.nextLine();
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("It is a palindrome.");
            System.out.println("Reverse: " + reverse);
        } else {
            System.out.println("It is NOT a palindrome.");
            System.out.println("Reverse: " + reverse);
        }
    }
}
