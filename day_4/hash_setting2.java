import java.util.HashSet;
//import java.util.Scanner;
public class hash_setting2 {
    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40,50, 50};
       // int target = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                System.out.println("Duplicate : "+num);
            }
            else{
            set.add(num);
        }
    }
}
}