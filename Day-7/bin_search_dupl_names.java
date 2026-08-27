public class bin_search_dupl_names {
    public static void main(String[] args) {

        String[] names = {
            "Arun", "Bharat", "Kiran",
            "Rahul", "Rahul", "Rahul",
            "Vijay"
        };

        String key = "Rahul";
        int left = 0;
        int right = names.length - 1;
        int first = -1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if (names[mid].equals(key)) {
                first = mid;
                right = mid - 1;
            }
            else if (key.compareTo(names[mid]) > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        left = 0;
        right = names.length - 1;
        int last = -1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if (names[mid].equals(key)) {
                last = mid;
                left = mid + 1;
            }
            else if (key.compareTo(names[mid]) > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        if (first != -1) {
            System.out.println("First index: " + first);
            System.out.println("Last index: " + last);
        }
        else {
            System.out.println("Name not found");
        }
    }
}