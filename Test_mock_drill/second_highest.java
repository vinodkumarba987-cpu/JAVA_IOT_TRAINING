import java.util.Arrays;

public class second_highest {
    public static void main(String[] args) {
        int[] arr = { 50000, 30000, 70000, 60000 };

        Arrays.sort(arr);

        System.out.println("Second Highest : " + arr[arr.length - 2]);
    }
}
