public class UnionNames {

    public static void main(String[] args) {

        String[] a = {"Rahul", "Arun", "Vijay", "Ravi", "Arun"};
        String[] b = {"Vijay", "Kiran", "Ravi", "Suresh"};

        String[] union = new String[a.length + b.length];
        int k = 0;

        for (String name : a) {

            boolean found = false;

            for (int i = 0; i < k; i++) {
                if (union[i].equals(name)) {
                    found = true;
                    break;
                }
            }

            if (!found)
                union[k++] = name;
        }

        for (String name : b) {

            boolean found = false;

            for (int i = 0; i < k; i++) {
                if (union[i].equals(name)) {
                    found = true;
                    break;
                }
            }

            if (!found)
                union[k++] = name;
        }

        System.out.print("Union: ");

        for (int i = 0; i < k; i++)
            System.out.print(union[i] + " ");
    }
}