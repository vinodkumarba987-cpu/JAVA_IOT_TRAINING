public class StringDifference {

    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sf = new StringBuffer("Hello");

        str = str + " World";
        sb.append(" World");
        sf.append(" World");

        System.out.println("String        : " + str);
        System.out.println("StringBuilder : " + sb);
        System.out.println("StringBuffer  : " + sf);
    }
}