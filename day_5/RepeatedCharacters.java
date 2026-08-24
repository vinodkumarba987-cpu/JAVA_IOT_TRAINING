public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "programming";
        int[] counts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            counts[currentChar]++;
        }
        
        System.out.println("Repeated characters in '" + str + "':");
        int totalRepeatedCount = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                System.out.println((char) i + " appears " + counts[i] + " times");
                totalRepeatedCount++;
            }
        }
        
        System.out.println("Total distinct repeated characters: " + totalRepeatedCount);
    }
}
