package dp.medium;

import binarysearch.medium.SearchinRotatedSortedArray33;

import java.util.Arrays;

public class LargestSumofAverages813 {
    public static double largestSumOfAverages1(int[] A, int K) {
        double[][] dp = new double[K + 1][A.length];
        dp[0][0] = (double) A[0];
        dp[1][0] = (double) A[0];
        for (int i = 1; i < A.length; i++) {
            dp[0][i] = dp[0][i - 1] + A[i];
            dp[1][i] = dp[0][i] / (i + 1);
        }
        for (int i = 2; i < K + 1; i++)
            for (int j = i - 1; j < A.length; j++)
                for (int p = i - 1; p <= j; p++)
                    dp[i][j] = Double.max(dp[i][j], dp[i - 1][p - 1] + (dp[0][j] - dp[0][p - 1]) / (j - p + 1));
        return dp[K][A.length - 1];
    }

    public static double largestSumOfAverages2(int[] A, int K) {
        double[] p = new double[A.length];
        double[] dp = new double[A.length];
        p[0] = A[0];
        for (int i = 1; i < A.length; i++)
            p[i] = p[i - 1] + A[i];
        for (int i = 0; i < A.length; i++)
            dp[i] = p[i] / (i + 1);

        for (int k = 2; k <= K; k++)

            for (int i = A.length - 1; i >= k - 1; i--)
                for (int j = k - 1; j <= i; j++)   // find the value of dp[i],p[j] belong to the last grou
                    dp[i] = Math.max(dp[i], dp[j - 1] + (p[i] - p[j - 1]) / (i - j + 1));


        return dp[A.length - 1];
    }

    public static double largestSumOfAverages(int[] A, int K) {
        int n = A.length;
        double[][] dp = new double[K + 1][n + 1];
        double curr = 0;
        for (int i = 0; i < A.length; i++) {
            curr += A[i];
            dp[1][i + 1] = curr / (i + 1);

        }

        return search(n, K, A, dp);
    }

    private static double search(int n, int k, int[] A, double[][] dp) {
        if (dp[k][n] > 0) return dp[k][n];
        if (n < k) return 0;
        double cur = 0;
        for (int i = n - 1; i > 0; i--) {
            cur += A[i];
            dp[k][n] = Math.max(dp[k][n], search(i, k - 1, A, dp) + cur / (n - i));
        }

        return dp[k][n];

    }


    public static void main(String[] args) {
        largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3);
    }


}
