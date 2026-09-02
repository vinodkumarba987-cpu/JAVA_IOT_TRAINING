public class fib_space_optimization {

    void fib(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        new fib_space_optimization().fib(7);
    }
}