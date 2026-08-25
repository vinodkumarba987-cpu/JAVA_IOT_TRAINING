public class JoinNames {

    public static void main(String[] args) {

        String[] a = {"Rahul", "Arun", "Vijay"};
        String[] b = {"Kiran", "Ravi", "Suresh"};

        String[] c = new String[a.length + b.length];

        for (int i = 0; i < a.length; i++)
            c[i] = a[i];

        for (int i = 0; i < b.length; i++)
            c[a.length + i] = b[i];

        for (String name : c)
            System.out.println(name);
    }
}