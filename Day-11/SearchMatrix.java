public class SearchMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {10, 20, 30,40},
            {15, 25, 35,45},
            {27, 29, 37,48},
            {50,55,60,70}
        };

        int key = 37;
        int i = 0, j = 2;

        while (i < 3 && j >= 0) {

            if (a[i][j] == key) {
                System.out.println("Found"+a[i][j]);
                return;
            }

            if (a[i][j] > key)
                j--;
            else
                i++;
        }

        System.out.println("Not Found");
    }
}