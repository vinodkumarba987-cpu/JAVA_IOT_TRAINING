public class RabinKarp {
    public static void main(String[] args) {

        String text = "ABABCAB";
        String pattern = "CAB";

        int m = pattern.length();
        int n = text.length();

        int ph = 0, th = 0;
        for (int i = 0; i < m; i++) {
            ph += pattern.charAt(i);
            th += text.charAt(i);
        }
        for (int i = 0; i <= n - m; i++) {

            if (ph == th) {
                if (text.substring(i, i + m).equals(pattern)) {
                    System.out.println("Pattern Found at " + i);
                    return;
                }
            }
            if (i < n - m)
                th = th - text.charAt(i) + text.charAt(i + m);
        }

        System.out.println("Pattern Not Found");
    }
}