public class program13{
    public static void main(String[] args) {
        String s1 ="Hello";
        String s2= s1;
        String s3 =new String("Hello !");
        String s4 = new String("world !");
        s1=s2+"World";
        System.out.println("S1= "+s1);
        System.out.println("S2= "+s2);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println(s1==s2);
    }


}