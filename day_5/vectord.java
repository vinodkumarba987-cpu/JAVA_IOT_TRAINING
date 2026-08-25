//package day_4;
import java.util.Vector;
public class vectord {
    public static void main(String[] args) {
        // sor
        Vector vector=new Vector();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println("No of elements in the vector : "+vector.size());
        System.out.println("Capacity of vector : "+vector.capacity());
        System.out.println("Values stored : "+vector);
        vector.trimToSize();
        System.out.println("after trimming.....");
        System.out.println("No of elements in vector : "+vector.size());
        System.out.println("capacity : "+vector.capacity());
        System.out.println("Values stored : "+vector);
        System.out.println(vector.isEmpty());
    }
}
