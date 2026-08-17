package java_training;

public class Program10 {

    void rectangle(int l, int w) {
        int area = l * w;

        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {

        Program10 test = new Program10();

        int l = 10;
        int w = 5;

        test.rectangle(l, w);
    }
}