import java.util.*;
public class SubstringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int count = 0;
        System.out.println("The substrings are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // Extract the substring from index i to j-1
                String sub = str.substring(i, j);
                System.out.println(sub);
                count++;
            }
        }

        System.out.println("\nTotal number of substrings made: " + count);
    }
}
