package dfs.medium;

import java.util.Arrays;

//There is an m by n grid with a ball. Given the start coordinate (i,j) of the ball, you can move the ball to adjacent cell or cross the grid boundary in four directions (up, down, left, right). However, you can at most move N times. Find out the number of paths to move the ball out of grid boundary. The answer may be very large, return it after mod 109 + 7.
public class OutofBoundaryPaths576 {
    public int findPaths(int m, int n, int N, int i, int j) {
        if (N < 0) return 0;
        final int MOD = 1000000007;
        int[][] count = new int[m][n];
        count[i][j] = 1;
        int result = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int step = 0; step < N; step++) {
            int[][] temp = new int[m][n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    for (int[] d : dirs) {
                        int nr = r + d[0];
                        int nc = c + d[1];
                        if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                            result = (result + count[r][c]) % MOD;
                        else
                            temp[nr][nc] = (temp[nr][nc] + count[r][c]) % MOD;
                    }
                }
            }
            count = temp;
        }
        return result;
    }

    // dfs with memorization
    private int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int MOD = 1000000007;
    public int findPaths1(int m, int n, int N, int i, int j) {
        int[][][] memo = new int[m][n][N+1];
        for(int ii = 0 ; ii < m; ii++)
            for(int jj = 0; jj < n; jj++)
                Arrays.fill(memo[ii][jj], -1);
            return dfs(m, n, N, i, j, memo);
    }

    private int dfs(int m, int n, int N, int i, int j, int[][][] memo){
        if(i < 0 || j < 0|| i >= m || j >= n) return 1;
        if(N == 0) return 0;
        if(memo[i][j][N] != -1) return memo[i][j][N];
        memo[i][j][N] = 0;
        for(int[] d  : dirs){
            int x = d[0] + i;
            int y = d[1] + j;
            memo[i][j][N] = (memo[i][j][N] + dfs(m, n, N-1, x, j, memo) % MOD) % MOD ;
        }
        return memo[i][j][N];
    }


    }
