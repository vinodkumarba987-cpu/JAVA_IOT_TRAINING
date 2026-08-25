public class highest_profit {

    public static void main(String[] args) {

        int[] expenses = {100, 200, 150, 300, 250, 400};

        int[] prefixSum = new int[expenses.length];

        prefixSum[0] = expenses[0];

        for (int i = 1; i < expenses.length; i++)
            prefixSum[i] = prefixSum[i - 1] + expenses[i];

        int max = prefixSum[2];
        int start = 0; 

        for (int i = 3; i < expenses.length; i++) {

            int sum = prefixSum[i] - prefixSum[i - 3];

            if (sum > max) {
                max = sum;
                start = i - 2;
            }
        }

        System.out.println("Highest Profit: " + max);
        System.out.print("Subarray: ");

        for (int i = start; i < start + 3; i++)
            System.out.print(expenses[i] + " ");
    }
}