import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow {

    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 50, 40};
        int size = 3;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            q.add(arr[i]);

            if (q.size() == size) {

                System.out.println("Highest = " + java.util.Collections.max(q));

                q.remove();
            }
        }
    }
}