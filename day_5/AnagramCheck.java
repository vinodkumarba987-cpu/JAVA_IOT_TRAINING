
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if (word1.length() != word2.length()) {
            System.out.println("NOT an anagram (different lengths).");
            return;
        }
        
        int[] charCounts = new int[256];

        for (int i = 0; i < word1.length(); i++) {
            charCounts[word1.charAt(i)]++;
            charCounts[word2.charAt(i)]--;
        }
        
        boolean isAnagram = true;
    
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("'" + word1 + "' and '" + word2 + "' are anagrams.");
        } else {
            System.out.println("'" + word1 + "' and '" + word2 + "' are NOT anagrams.");
        }
    }
}
