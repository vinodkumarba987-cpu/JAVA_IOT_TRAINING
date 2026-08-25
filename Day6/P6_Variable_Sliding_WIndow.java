public class P6_Variable_Sliding_WIndow {
    public static void main(String[] args) {
    	int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int left = 0, sum = 0;
        int minLength = arr.length + 1;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        System.out.println("Minimum window length = " + minLength);
    }
}