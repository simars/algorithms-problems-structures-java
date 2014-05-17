/**
 * User: Simar Paul Singh
 * Date: 17/04/14
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class UniqueValue {


    public static void main(String ...args) {

        int array[] = {1,2,4,3,3,1,2,5,5};
        System.out.println(Singular(array));
    }

    static  int Singular(int[] a)
    {
        int value = 0;
        for (int i = 0; i < a.length; i++)
            value = value ^ a[i];
        return value;
    }
}
