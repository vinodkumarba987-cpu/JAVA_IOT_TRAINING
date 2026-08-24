//package day_4;
import java.util.HashSet;
public class HashsetDemo1 {
    public static void main(String[] args) {
        // sor
        HashSet v=new HashSet();
        System.out.println("Initial size of hashset : "+v.size());
        System.out.println("Hash set is empty : "+v.isEmpty());
        System.out.println("Values stored : "+v);
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add(null);
        System.out.println("No of elements in vector : "+v.size());
        System.out.println("Is empty : "+v.isEmpty());
        System.out.println("Values stored : "+v);
        boolean b1 =v.contains("E");
        System.out.println("Value E is present "+b1);
        boolean b2 =v.contains("R");
        System.out.println("Value R present ? "+b2);
        v.remove("C");
        System.out.println("Size after removal : "+v.size());
        System.out.println("Contents after deletion : "+v);
        v.clear();
        System.out.println("Size of Hashset after clearing : "+v.size());
    }
}