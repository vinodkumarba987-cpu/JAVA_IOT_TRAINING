
//testing the errors outside try catch block
public class exception_handling3 {
    public static void main(String[] args) {
        System.out.println("Vinod");
        System.out.println("Vinod kumar");
        int a= 10/0;
        try {
            System.out.println("Inside try block !");
        } finally {
            System.out.println("Finally block !");
        }
        System.out.println("Rest of the code !");
    }
}
