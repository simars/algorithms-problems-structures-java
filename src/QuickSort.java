import java.util.Arrays;

/**
 * User: Simar Paul Singh
 * Date: 17/04/14
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {


   public static void main(String ... args) {

       int A[] = {1,4,3,3,1,1,2};
       System.out.println(solution(A));
       System.out.println(Arrays.toString(A));

    }


    static int  solution(int A[]) {
        quickSort(A,0,A.length-1);
        int i=0;
        do {
            if(A[i] != A[i+1]) {
                return A[i];
            }
            else do
            {
                i++;
            } while((A[i] == A[i+1]));
            i++;

        } while(i < A.length-2);
        if(A[i] != A[i+1]) {
            return A[i+1];
        }
        return -1;
    }

    static void quickSort(int A[], int p, int r) {
        if(p < r) {
            int q = partition(A,p,r);
            quickSort(A, p, q);
            quickSort(A, q + 1, r);
        }
    }

    static int partition(int[] A, int p, int r) {
        int pivot = A[p];
        int i = p-1;
        int j = r+1;

        while(true) {
            do {
                i++;
            } while(i<r && A[i] < pivot);
            do {
                j--;
            } while(j>p && A[j] > pivot);

            if( i< j) {
                swap(A,i,j);
            } else {
                return j;
            }
        }
    }

    static void swap(int A[],int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
