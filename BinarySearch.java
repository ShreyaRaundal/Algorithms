import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {2, 4, 10, 15, 20, 28};
        int target = 15;

        int result = binarySearch(ar, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] a, int search) {
        int start = 0, end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == search) {
                return mid;
            } else if (search > a[mid]) {
                start = mid + 1;
            } else if (search < a[mid]) {
                end = mid - 1;
            }
        }

        return -1;
    }
}
