import java.util.ArrayList;
import java.util.Iterator;

public class p5_iterator{
    public static void main(String[] args) {

        ArrayList<Integer> money = new ArrayList<>();

        money.add(10000);
        money.add(8000);
        money.add(6000);
        money.add(4000);
        money.add(2000);

        Iterator<Integer> it = money.iterator();

        while (it.hasNext()) {
            int amount = it.next();
            System.out.println(amount - 2000);
        }
    }
}