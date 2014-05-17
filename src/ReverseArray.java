import java.util.Arrays;

/**
 * User: Simar Paul Singh
 * Date: 13/04/14
 * Time: 1:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseArray {

    static int INPUT[] = {1, 2, 3, 4, 5};

    public static void main(String... args) {


        for (int start = 0, end = INPUT.length - 1; end > start; start++, end--) {
            INPUT[start] += INPUT[end];
            INPUT[end] = INPUT[start] - INPUT[end];
            INPUT[start] -= INPUT[end];
        }

        System.out.println(Arrays.toString(INPUT));


    }
}
