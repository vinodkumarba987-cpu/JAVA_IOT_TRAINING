import java.util.HashSet;
import java.util.Iterator;

public class hashset_using_iterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(20);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(null);
        set.add(null);
        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}