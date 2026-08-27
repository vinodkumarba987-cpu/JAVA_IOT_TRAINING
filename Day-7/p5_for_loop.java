public class p5_for_loop{
    public static void main(String[] args) {

        int amount = 10000;

        for (int i = 0; i < 5; i++) {
            amount = amount - 2000;
            System.out.println(amount);
        }
    }
}