
package java_training;

public class Program8 {

    void triangle(int b, int h) {
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle = " + area);
    }

    public static void main(String[] args) {

        Program8 test = new Program8();

        int b = 10;
        int h = 5;

        test.triangle(b, h);
    }
}
