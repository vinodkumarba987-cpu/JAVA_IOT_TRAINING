import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class max_hashset {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(25000);
        set.add(30000);
        set.add(40000);
        set.add(50000);
        System.out.println(Collections.max(set));
    }
}