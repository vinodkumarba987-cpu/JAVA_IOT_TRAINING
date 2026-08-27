public class bin_search_name {

    static int binarySearch(String[] names, String key) {

        int left = 0;
        int right = names.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (names[mid].equals(key)) {
                return mid;
            }
            else if (key.compareTo(names[mid]) > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Arun","Bharat","Kiran","Rahul","Vijay"};

        String key = "Rahul";

        int result = binarySearch(names, key);

        if (result != -1)
            System.out.println("Name found at index: " + result);
        else
            System.out.println("Name not found");
    }
}