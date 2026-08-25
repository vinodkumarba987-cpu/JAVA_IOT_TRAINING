public class marks_Prefix_Suffix {

    public static void main(String[] args) {

        int[] marks = {100, 200, 150, 300, 250};
        int[] prefixSum = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            prefixSum[i] = marks[i];

            if (i > 0)
                prefixSum[i] += prefixSum[i - 1];
        }

        int sum = prefixSum[3] - prefixSum[0];

        System.out.println("Total score:" + sum);
    }
}
//who is givinng highest profit {subarray -3 only max limit}