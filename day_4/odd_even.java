import java.util.*;
//modulo
public class odd_even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int Remain=num%2;
        boolean fin=false;
        if(Remain==0){
            System.out.println("Even !");
            fin =true;
        } 
        else {
            System.out.println("Odd");
            fin =false;
        }
    }
}
//java program
//stores 23 in a variable called students
//stores 5 in variable called studentsperrow
//uses modulo % to find how many students are left
//prints the rsult