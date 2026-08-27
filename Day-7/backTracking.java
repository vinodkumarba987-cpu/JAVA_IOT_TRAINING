public class backTracking{

    static void backtrack(int n) {

        if (n == 0)
            return;

        System.out.println("Going: " + n);

        backtrack(n - 1);

        System.out.println("Backtracking: " + n);
    }

    public static void main(String[] args) {
        backtrack(5);
    }
}