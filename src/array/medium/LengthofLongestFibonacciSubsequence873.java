package array.medium;

public class LengthofLongestFibonacciSubsequence873 {
    public int lenLongestFibSubseq(int[] A) {
        int n = A.length;
        int max = 0;
        int[][] dp = new int[n][n];
        for (int i = 1; i < n; i++) {
            int l = 0, r = i - 1;
            while (l < r) {
                int sum = A[l] + A[r];
                if (sum > A[i]) {
                    r--;
                } else if (sum < A[i]) {
                    l++;
                } else {
                    dp[r][i] = dp[l][r] + 1;
                    max = Math.max(max, dp[r][i]);
                    r--;
                    l++;
                }
            }
        }

        return max == 0 ? 0 : max + 2;
    }
}
