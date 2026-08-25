
public class IntersectionNames {

    public static void main(String[] args) {

        String[] a = {"Rahul", "Arun", "Vijay", "Ravi"};
        String[] b = {"Vijay", "Kiran", "Ravi", "Suresh"};

        System.out.print("Intersection: ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i].equals(b[j])) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}