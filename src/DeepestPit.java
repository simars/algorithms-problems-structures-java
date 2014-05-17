/**
 * User: Simar Paul Singh
 * Date: 14/05/14
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
import java.math.*;

public class DeepestPit {

    public static void main(String ... args) {
      int A[] = new int[10];

        A[0] =  0 ;
        A[1] =  1  ;
        A[2] =  3   ;
        A[3] = -2    ;
        A[4] =  0     ;
        A[5] =  1      ;
        A[6] =  0       ;
        A[7] = -3        ;
        A[8] =  2         ;
        A[9] =  3          ;
        System.out.println(solution(A));


    }

    public static int solution(int[] A) {

        int maxPitSize = -1;
        int maxP = -1;
        int maxQ = -1;
        int maxR = -1;

        int P = 0;

        int Q = 0;

        int R = 0;

        int index = 0;

        while(index < A.length ) {
            P = index;
            index ++;
            if(index < A.length && A[P] > A[index] ) {
                Q = index;
                index ++;
                while(index < A.length && A[Q] > A[index] ) {
                    Q = index;
                    index ++;
                }
            }
            if(P  >= Q) {
                continue;
            }
            if (index < A.length && A[Q] < A[index]) {
                R = index;
                index ++;
                while (index < A.length && A[R] < A[index]) {
                    R = index;
                    index ++;
                }
                index --;
            }
            if(Q >= R) {
                continue;
            }
            if(Q > P && R > Q) {
                int pitSize = Math.min((A[P] - A[Q]), (A[R] - A[Q]) );
                if(pitSize > maxPitSize) {
                    maxPitSize = pitSize;
                    maxP = P;
                    maxQ = Q;
                    maxR = R;
                }
            }
        }
        System.out.println(" " + maxP + " " + maxQ  + " " + maxR  );
        return maxPitSize;

    }
}
