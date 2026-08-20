public class BasicIteration {
    public static void main(String[] args) {
        int n = 10000;
        int[] stud = new int[n];
        int targ = 1000;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            stud[i] = i + 1;
            if (stud[i] == targ) {
                found = true;
                break;
            }
        }
        System.out.println("Student Found: " + found);
    }
}