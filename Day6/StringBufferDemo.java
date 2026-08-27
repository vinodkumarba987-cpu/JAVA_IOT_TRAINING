public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original : " + sb);

        sb.append(" World");
        System.out.println("Append   : " + sb);

        sb.insert(5, " Java");
        System.out.println("Insert   : " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("Replace  : " + sb);

        sb.delete(2, 7);
        System.out.println("Delete   : " + sb);

        sb.reverse();
        System.out.println("Reverse  : " + sb);

        System.out.println("Length   : " + sb.length());
    }
}