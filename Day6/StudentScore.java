public class StudentScore {
    public static void main(String[] args) {

        int[] score = {70, 80, 60, 90};

        int sum = 0;
        int max = score[0];

        for (int i = 0; i < score.length; i++) {

            sum += score[i];

            if (sum > max)
                max = sum;

            if (sum < 0)
                sum = 0;
        }

        System.out.println("Highest Score = " + max);
    }
}