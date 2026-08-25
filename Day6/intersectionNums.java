public class intersectionNums {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};
        int[] b = {30, 40, 50, 60};

        System.out.print("Intersection: ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}