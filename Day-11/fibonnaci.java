public class fibonnaci{

    void fib(int num) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        fibonnaci test = new fibonnaci();

        int a = 7;
        test.fib(a);
    }
}