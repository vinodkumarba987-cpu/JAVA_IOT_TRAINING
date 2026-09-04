import java.util.Arrays;

public class Task3_sorting {
    public static void main(String[] args) {

        int[] a = { 1, 0, 3, 4 };

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != i) {
                System.out.println("Missing = " + i);
                break;
            }
        }
    }
}
