public class merge_sort_names {

    static void mergeSort(String[] names, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(names, left, mid);
            mergeSort(names, mid + 1, right);

            String[] temp = new String[right - left + 1];

            int i = left;
            int j = mid + 1;
            int k = 0;

            while (i <= mid && j <= right) {

                if (names[i].compareTo(names[j]) <= 0) {
                    temp[k] = names[i];
                    i++;
                } else {
                    temp[k] = names[j];
                    j++;
                }

                k++;
            }

            while (i <= mid) {
                temp[k] = names[i];
                i++;
                k++;
            }

            while (j <= right) {
                temp[k] = names[j];
                j++;
                k++;
            }

            for (i = left, k = 0; i <= right; i++, k++) {
                names[i] = temp[k];
            }
        }
    }

    public static void main(String[] args) {

        String[] names = {
            "Rahul",
            "Arun",
            "Vijay",
            "Kiran",
            "Bharat"
        };

        System.out.println("Before sorting:");

        for (String name : names)
            System.out.print(name + " ");

        mergeSort(names, 0, names.length - 1);

        System.out.println("\n\nAfter sorting:");

        for (String name : names)
            System.out.print(name + " ");
    }
}