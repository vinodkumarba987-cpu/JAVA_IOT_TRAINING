public class SearchMatrix_alphabet {
    public static void main(String[] args) {

        char[][] a = {
            {'A','B','C','D'},
            {'E','F','G','H'},
            {'I','J','K','L'},
            {'M','N','O','P'}
        };

        char key = 'K';

        int i = 0, j = 3;

        while (i < 4 && j >= 0) {

            if (a[i][j] == key) {
                System.out.println("Found");
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