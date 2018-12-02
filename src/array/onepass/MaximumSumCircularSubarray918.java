package array.onepass;

public class MaximumSumCircularSubarray918 {
    public int maxSubarraySumCircular(int[] A) {
        int totol = 0, maxSum = Integer.MIN_VALUE, curMax = 0, minSum = Integer.MAX_VALUE, curMin = 0;
        for(int a : A){
            curMax = Math.max(curMax +a, a );
            maxSum = Math.max(curMax,maxSum );
            curMin  = Math.min(curMin + a,a );
            minSum  = Math.min(curMin,minSum );
            totol +=a;
        }
        return maxSum > 0?(Math.max(maxSum, totol - minSum )):maxSum;
    }
}
