import java.util.HashSet;
import java.util.*;

public class counter_hashaset {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(101);
        set.add(102);
        set.add(101);
        set.add(103);
        set.add(101);
        int count = 0;
        for (Integer i : set) {
            if (set.contains(101)) {
                count++;
            }
        }
        System.out.println("Count : " + count);
    }
}