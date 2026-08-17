package java_training;

public class program7 {

    void circle(int r) {
        double area = Math.PI * r * r;
        System.out.println("Area of Circle = " + area);
    }

    public static void main(String[] args) {

        program7 test = new program7();

        int r = 5;
        test.circle(r);
    }
}

package java_training;

public class program8 {

    void triangle(int b, int h) {
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle = " + area);
    }

    public static void main(String[] args) {

        program8 test = new program8();

        int b = 10;
        int h = 5;

        test.triangle(b, h);
    }
}
package java_training;

public class program9 {

    void palindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        program9 test = new program9();

        int a = 121;
        test.palindrome(a);
    }
}