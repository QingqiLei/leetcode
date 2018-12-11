package dp.medium;

import java.util.Arrays;
/*
Given a square array of integers A, we want the minimum sum of a falling path through A.

A falling path starts at any element in the first row, and chooses one element from each row.  The next row's choice must be in a column that is different from the previous row's column by at most one.
 */
public class MinimumFallingPathSum931 {
    public int minFallingPathSum2(int[][] A) {
        for (int i = 1; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] += Math.min(A[i - 1][j], Math.min(A[i - 1][Math.max(j - 1, 0)], A[i - 1][Math.min(j + 1, A[i - 1].length - 1)]));
            }

        return Arrays.stream(A[A.length - 1]).min().getAsInt();
    }

    public int minFallingPathSum1(int[][] A) {

        for (int i = 1; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++) {
                int best = A[i - 1][j];
                if (j > 0) best = Math.min(best, A[i - 1][j - 1]);
                if (j < A.length - 1) best = Math.min(best, A[i - 1][j + 1]);
                A[i][j] += best;
            }
        int ans = Integer.MAX_VALUE;
        for (int x : A[0])
            ans = Math.min(ans, x);
        return ans;
    }
}
