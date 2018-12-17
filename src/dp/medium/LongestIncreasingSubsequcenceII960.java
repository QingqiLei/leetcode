package dp.medium;

import java.util.Arrays;

public class LongestIncreasingSubsequcenceII960 {
    public int minDeletionSize(String[] A) {
        int max = 0, words = A.length, len = A[0].length(), i;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int col = 0; col < len; col++)
            for (int before = 0; before < col; before++) {
                for (i = 0; i < words; i++)
                    if (A[i].charAt(col) < A[i].charAt(before)) break;
                if (i == words && dp[before] + 1 > dp[col]) dp[col] = dp[before] + 1;
                max = Math.max(max, dp[col]);
            }
        return len - max;
    }
}
