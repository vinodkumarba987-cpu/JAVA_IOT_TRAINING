package java_training;

public class Program5 {
    int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Program5 test = new Program5();
        int a = 7;
        int result = test.fact(a);
        System.out.println("Factorial of " + a + " is: " + result);
    }
}
