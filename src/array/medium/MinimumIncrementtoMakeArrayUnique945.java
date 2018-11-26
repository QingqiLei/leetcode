package array.medium;

import java.util.Arrays;

/**
 * Given an array of integers A, a move consists of choosing any A[i], and incrementing it by 1.
 *
 * Return the least number of moves to make every value in A unique.
 */
public class MinimumIncrementtoMakeArrayUnique945 {
    public int minIncrementForUnique(int[] A) {
        int ans = 0, need = 0;
        Arrays.sort(A);
        for(int n : A){
            ans += Math.max((need - n),0 );
            need = Math.max(need,n )+1;
        }
        return ans;
    }
}
