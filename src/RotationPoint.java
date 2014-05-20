import java.util.Arrays;

/**
 * User: Simar Paul Singh
 * Date: 19/05/14
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotationPoint {


    public static void main(String... args) {

        int[] arr = {7, 8, 0 , 1, 2, 3, 4, 5, 6};

        int valueIndex = findRotationInAscendingArray(arr);
        if (valueIndex < 0) {
            System.out.println("Rotation point not found in " + Arrays.toString(arr));
        } else {
            System.out.println("Rotation Point: Value " + arr[valueIndex] + " found at index " + valueIndex + " in " + Arrays.toString(arr));
        }

    }

    public static int findRotationInAscendingArray(int[] arr) {
        return findRotationInAscendingArray(arr, 0, arr.length - 1);
    }

    public static int findRotationInAscendingArray(final int[] arr, final int start, final int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] < arr[mid - 1]) {
            return mid;
        }
        if (arr[mid] > arr[end]) {
            return findRotationInAscendingArray(arr, mid + 1, end);
        } else if (arr[mid] < arr[start]) {
            return findRotationInAscendingArray(arr, start, mid - 1);
        }
        return -1;
    }
}
