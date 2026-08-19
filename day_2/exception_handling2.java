//testing finally block
class testing
{
    public static void main(String[] args){
        try {
            System.out.println("Vinod");
            System.out.println(10/0);
        } catch (NullPointerException ne) {
        }
        finally{

            System.out.println("Finally block execution !");
        }
        System.out.println("Rest codes !");
    }
}