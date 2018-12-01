package array.onepass;

/**
 * In an array A of 0s and 1s, how many non-empty subarrays have sum S?
 */
public class BinarySubarraysWithSum930 {
    public int numSubarraysWithSum(int[] A, int S) {
        int[] array = new int[A.length+1];
        array[0] = 1;
        int res = 0;
        for(int i = 0,preSum = 0; i < A.length; i++){
            preSum += A[i];
            if(preSum >= S) res += array[preSum - S];
            array[preSum]++;
        }
        return res;
    }
}
