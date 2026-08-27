public class floor_ceil_names {
    public static void main(String[] args) {

        String[] names = {
            "Arun", "Bharat", "Kiran", "Rahul", "Vijay"
        };

        String key = "Ravi";

        int left = 0;
        int right = names.length - 1;

        String floor = null;
        String ceil = null;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (names[mid].equals(key)) {
                floor = names[mid];
                ceil = names[mid];
                break;
            }

            else if (names[mid].compareTo(key) < 0) {
                floor = names[mid];
                left = mid + 1;
            }

            else {
                ceil = names[mid]; 
                right = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }
}