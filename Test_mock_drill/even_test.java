import java.util.Collections;

public class even_test {
    public static void main(String[] args) {
        int[] num = { 10, 15, 20, 25, 30 };
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                // System.out.println("even : " + num[i]);
                count++;
            }
        }
        System.out.println("count:" + count);

    }
}
