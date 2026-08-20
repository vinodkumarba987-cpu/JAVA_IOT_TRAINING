import java.util.*;
public class StudentsModulo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of students : ");
        byte students = sc.nextByte();
        System.out.println("Enter number of students per row : ");

        byte studentsPerRow = sc.nextByte();

        int remainingStudents = students % studentsPerRow;

        System.out.println("Students left without a full row: " + remainingStudents);
    }
}
