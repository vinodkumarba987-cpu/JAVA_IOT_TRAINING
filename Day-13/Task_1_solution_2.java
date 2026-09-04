public class Task_1_solution_2 {
    public static void main(String[] args) {

        int[] a = { 1, 2, 2, 3, 4, 4, 5 };
        int[] b = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                b[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++)
            System.out.print(b[i] + " ");
    }
}
