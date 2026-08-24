import java.util.HashSet;

public class hashset_using_for_loop
 {
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
        set.add(90);
        set.add(null);
        set.add(null);

        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        for (Integer value : set) {
            System.out.println(value);
        }
    }
}