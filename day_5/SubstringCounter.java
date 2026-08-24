public class SubstringCounter {
    public static void main(String[] args) {
        String str = "abc";
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
