public class Kadane {
    public static void main(String[] args) {

        int[] arr = {5,3,-2,4,-20,6,2};

        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > max)
                max = sum;

            if (sum < 0)
                sum = 0;
        }

        System.out.println("Maximum Sum = " + max);
    }
}