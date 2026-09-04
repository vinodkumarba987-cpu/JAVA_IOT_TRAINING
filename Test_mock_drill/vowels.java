public class vowels {
    public static void main(String[] args) {
        String str = "bcdfghjk";
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1)
                System.out.println("Vowel : " + c);
            else
                System.out.println("Not Found !");
            break;
        }
    }
}