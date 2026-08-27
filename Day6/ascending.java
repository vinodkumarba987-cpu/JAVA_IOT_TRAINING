public class ascending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            right--;
        }
        System.out.print("Ascending: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}