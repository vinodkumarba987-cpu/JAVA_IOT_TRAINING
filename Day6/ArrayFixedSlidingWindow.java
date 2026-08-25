public class ArrayFixedSlidingWindow {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60};
        int windowSize = 3;
        for (int i = 0; i <= num.length - windowSize; i++) {
            int sum = 0;
            for (int j = i; j < i + windowSize; j++) {
                sum = sum + num[j];
            }

            System.out.println("Sum : " + sum);
        }
    }
}