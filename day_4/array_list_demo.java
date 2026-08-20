
import java.util.ArrayList;

public class array_list_demo {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<>();
        System.out.println("Initial size : "+list.size());
        System.out.println("Array list before adding values : "+list.isEmpty());
        System.out.println("Contents  : "+list);
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List after adding :"+list.size());
        System.out.println("contents : "+list);
        boolean s=list.contains("A");
        System.out.println("A is present : "+s);
        boolean sa=list.contains("R");
        System.out.println("R is present : "+sa);
        list.remove("A");
        System.out.println("List after removal : "+list.size());
        list.clear();
        System.err.println("After clearing list  : "+list.size());
        System.out.println("List : "+list);
    }
}