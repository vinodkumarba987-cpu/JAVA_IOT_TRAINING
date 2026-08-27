public class floor_ceil {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 25;

        int left = 0;
        int right = arr.length - 1;

        int floor = -1;
        int ceil = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }

            else if (arr[mid] < key) {
                floor = arr[mid];
                left = mid + 1;
            }

            else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }
}