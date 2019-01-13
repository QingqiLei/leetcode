package dp.medium;

public class RangeSumQuery2D304 {
    private int[][] dp;

    public RangeSumQuery2D304(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 1; i <= matrix.length; i++)
            for (int j = 1; j <= matrix[0].length; j++)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int x1 = Math.max(row1, row2);
        int x2 = Math.min(row1, row2);
        int y1 = Math.max(col1, col2);
        int y2 = Math.min(col1, col2);
        return dp[x1 + 1][y1 + 1] - dp[x1 + 1][y2] - dp[x2][y1 + 1] + dp[x2][y2];

    }
}
