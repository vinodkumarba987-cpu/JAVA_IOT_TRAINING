public class UnionArray {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 20};
        int[] b = {30, 40, 50, 60, 30};

        int[] union = new int[a.length + b.length];
        int k = 0;

        for (int num : a) {
            boolean found = false;

            for (int i = 0; i < k; i++) {
                if (union[i] == num) {
                    found = true;
                    break;
                }
            }

            if (!found)
                union[k++] = num;
        }

        for (int num : b) {
            boolean found = false;

            for (int i = 0; i < k; i++) {
                if (union[i] == num) {
                    found = true;
                    break;
                }
            }

            if (!found)
                union[k++] = num;
        }

        System.out.print("Union: ");

        for (int i = 0; i < k; i++)
            System.out.print(union[i] + " ");
    }
}