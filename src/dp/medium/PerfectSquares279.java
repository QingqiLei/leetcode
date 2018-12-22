package dp.medium;

import java.util.Arrays;
/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 */
public class PerfectSquares279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        int min = Integer.MAX_VALUE;
        int j = 1;
        for(int i = 1; i < n+1; i++){
            min = Integer.MAX_VALUE;
            j = 1;
            while( i - j*j > 0){
                min = Math.min(dp[i - j*j] + 1, min);
                j ++;
            }
            dp[i] = min;

        }
        return dp[n];
    }
}
