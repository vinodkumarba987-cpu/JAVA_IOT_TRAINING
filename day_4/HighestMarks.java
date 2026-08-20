public class HighestMarks {
    public static void main(String[] args) {
        int[] marks = {78, 65, 89, 92, 71};
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        System.out.println("The highest marks are: " + highest);
    }
}
