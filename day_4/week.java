
import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        //String cc= new String();
    //    String s1 ={"monday","tuesday"}
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("Enter a number (1-7) : ");
    byte choice =sc.nextByte();
    switch (choice) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        default:
        System.out.println("Invalid Choice !");
        continue;
    }
    }
}
}
