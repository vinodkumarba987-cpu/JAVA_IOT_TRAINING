
import java.util.Scanner;

class calculations{
    int a;int b;
    void addit(int a,int b){
        int res  =a+b;
        System.out.println("Addition : "+res);
    }
    void sub(){
        int res=a-b;
        System.out.println("Subtraction : " +res);
    }
    void mult(){
        int res=a*b;
        System.out.println("Multiplication : "+res);
    }
    void div(){
        try{
        float res =b/a;
        if (res >=0){
        System.out.println("Division : "+res);
    }else{
        System.out.println("error");
    }
}
    catch(Exception e){
        System.out.println("Division by zero error !");
    }
}
}
public class Simple_Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculations cc=new calculations();

        int c=sc.nextInt();
        int d=sc.nextInt();
        byte choice =sc.nextByte();
        switch (choice) {
            case 1:
                cc.addit(c,d);
                break;
            case 2:
                cc.sub();
            case 3:
                cc.mult();
            case 4:
            cc.div();
            default:
                System.err.println("invalid choice ! ");
        }
        sc.close();
    }
}
