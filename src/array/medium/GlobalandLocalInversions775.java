package array.medium;

/**
 * The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].
 *
 * The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].
 */
public class GlobalandLocalInversions775 {
    public boolean isIdealPermutation(int[] A) {
        int cmax = 0;
        for(int i = 0; i < A.length-2; i++){
            cmax = Math.max(cmax,A[i] );
            if(cmax > A[i+2]) return false;
        }
        return true;
    }

    public boolean isIdealPermutation1(int[] A) {
        for(int i = 0; i < A.length ;i++) if(Math.abs(A[i] -i) > 1) return false;
        return true;
    }

}
