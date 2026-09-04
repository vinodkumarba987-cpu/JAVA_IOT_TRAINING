import java.util.Collections;

public class counter {
    public static void main(String[] args) {
        int[] arr = { 101, 102, 101, 103, 101 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 101) {
                count++;
            }
        }
        System.out.println("Count : " + count);
    }
}
