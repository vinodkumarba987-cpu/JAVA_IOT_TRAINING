public class array_logic2 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int min = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }

        System.out.println("Minimum window length = " + min);
    }
}