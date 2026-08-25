public class array_fixed_sliding_windows {
    public static void main(String[] args) {
        int [] num = {10,20,30,40,50,60};
        int windowsize=3;
        int sum =0;
        for (int i = 0; i < windowsize; i++) {
            sum=sum+num[i];
        }
        System.out.println("Sum : "+sum);
        int start=0;
        for (int end = windowsize; end < num.length; end++) {
            sum=sum-num[start];
            sum=sum +num[end];
            start++;
            System.out.println("Sum : "+sum);
        }
    }
}
