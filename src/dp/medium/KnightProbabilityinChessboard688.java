package dp.medium;
/*
On an NxN chessboard, a knight starts at the r-th row and c-th column and attempts to make exactly K moves. The rows and columns are 0 indexed, so the top-left square is (0, 0), and the bottom-right square is (N-1, N-1).

A chess knight has 8 possible moves it can make, as illustrated below. Each move is two squares in a cardinal direction, then one square in an orthogonal direction.


 */
public class KnightProbabilityinChessboard688 {
    private static final int[][] dires = {{-1,2},{-1,-2},{-2,1},{-2,-1},{1,2},{1,-2},{2,1},{2,-1}};
    public double knightProbability(int N, int K, int r, int c) {
        double[][][] dp = new double[K+1][N][N];
        double count = dfs(N,K,r,c,dp);
        return count / Math.pow(8, K);
    }
    private double dfs(int N, int k, int r, int c,double[][][] dp) {
        if(r < 0 || c < 0 || r >N-1 || c > N -1) return 0;
        if(k == 0) return 1;
        if(dp[k][r][c] > 0) return dp[k][r][c];
        double count = 0;
        for(int[] pair: dires){
            int x  = r + pair[0];
            int y  = c + pair[1];
            count += dfs(N, k-1, x, y, dp);
        }
        dp[k][r][c] = count;
        return count;

    }
}
