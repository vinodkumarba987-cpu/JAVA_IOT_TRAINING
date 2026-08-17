package java_training;

public class Program7 {

    void circle(int r) {
        double area = Math.PI * r * r;
        System.out.println("Area of Circle = " + area);
    }

    public static void main(String[] args) {

        Program7 test = new Program7();

        int r = 5;
        test.circle(r);
    }
}
