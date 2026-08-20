public class PassedStudentsCount {
    public static void main(String[] args) {
        int[] marks = {35, 67, 89, 22, 45, 30, 76};
        int passCount = 0;
        for (int mark : marks) {
            if (mark >= 40) {
                passCount++;
            }
        }
        System.out.println("Number of students who passed: " + passCount);
    }
}
