
import java.util.Scanner;

public class NaivePatternMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String text = sc.nextLine();
        System.out.println("Enter a pattern : ");
        String pattern = sc.nextLine();
        
        int textLength = text.length();
        int patternLength = pattern.length();
        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patternLength) {
                System.out.println("Pattern found at index: " + i);
            }
        }
    }
}
