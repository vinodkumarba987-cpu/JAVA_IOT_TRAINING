import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        int[] a = { 1, 2, 2, 3, 4, 4, 5 };

        HashSet<Integer> set = new HashSet<>();

        for (int x : a)
            set.add(x);

        System.out.println(set);
    }
}