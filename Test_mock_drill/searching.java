public class searching {
    public static void main(String[] args) {
        int[] n = { 101, 102, 103, 104 };
        byte k = 103;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == k) {
                System.out.println("Element " + n[i] + " found at : " + i + "nd index");
                break;
            }
        }
    }
}