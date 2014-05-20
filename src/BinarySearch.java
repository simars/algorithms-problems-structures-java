import java.util.Arrays;

/**
 * User: Simar Paul Singh
 * Date: 19/05/14
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {

    public static void main(String... args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 5;

        int valueIndex = search(5, arr);
        if (valueIndex < 0) {
            System.out.println("Value " + value + " not found in" + Arrays.toString(arr));
        } else {
            System.out.println("Value " + arr[valueIndex] + " found at index " + valueIndex + " in " + Arrays.toString(arr));
        }

    }

    public static int search(int value, int[] arr) {
        return binarySearchAscending(value, arr, 0, arr.length - 1);
    }

    public static int binarySearchAscending(final int value, final int[] arr, final int start, final int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return binarySearchAscending(value, arr, mid + 1, end);
        } else {
            return binarySearchAscending(value, arr, start, mid - 1);
        }
    }


}
