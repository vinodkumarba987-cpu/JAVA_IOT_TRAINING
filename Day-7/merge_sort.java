public class merge_sort {

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            int i = left;
            int j = mid + 1;
            int k = 0;

            int[] temp = new int[right - left + 1];

            while (i <= mid && j <= right) {

                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }

                k++;
            }
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            while (j <= right) {
                temp[k] = arr[j];
                j++;
                k++;
            }
            for (i = left, k = 0; i <= right; i++, k++) {
                arr[i] = temp[k];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 50, 20, 30};
        System.out.println("Before sorting:");
        for (int x : arr)
            System.out.print(x + " ");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\n\nAfter sorting:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}