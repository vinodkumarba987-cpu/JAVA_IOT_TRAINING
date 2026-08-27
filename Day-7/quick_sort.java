public class quick_sort {
    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = a[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (a[j] < pivot) {
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            int temp = a[i + 1];
            a[i + 1] = a[high];
            a[high] = temp;
            int p = i + 1;
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] a = {40, 10, 30, 20, 50};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}