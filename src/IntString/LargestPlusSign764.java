package IntString;

import java.util.Arrays;

public class LargestPlusSign764 {
    public int orderOfLargestPlusSign1(int N, int[][] mines) {
        int res = 0;
        int[][] grid = new int[N][N];
        for (int[] i : grid) Arrays.fill(i, 1);
        for (int[] i : mines)
            grid[i[0]][i[1]] = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {

                if (i < res - 1 || j < res - 1 || N - i < res || N - j < res) continue;

                if (grid[i][j] == 1) {
                    int tmp = 1;
                    int ii = i, jj = j;

                    while (ii - tmp > -1 && jj - tmp > -1 && ii + tmp < N && jj + tmp < N && grid[ii - tmp][jj] == 1 && grid[ii + tmp][jj] == 1 && grid[ii][jj + tmp] == 1 && grid[ii][jj - tmp] == 1)

                        tmp++;


                    res = Math.max(res, tmp);

                }


            }
        return res;
    }
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        // if (N < 1) {
        //     return 0;
        // }
        // if (mines == null || mines.length == 0) {
        //     return N % 2 == 0 ? N/2 : N/2 + 1;
        // }

        int[][] grid = new int[N][N];

        for (int[] row : grid) {
            Arrays.fill(row, N);
        }
        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }

        for (int i = 0; i < N; i++) {
            int l = 0;
            int r = 0;
            int u = 0;
            int d = 0;
            for (int j = 0, k = N-1; j < N; j++, k--) {
                // Left to Right
                // How far left it can reach
                l = grid[i][j] == 0 ? 0 : l+1;
                grid[i][j] = Math.min(grid[i][j], l);

                // Right to Left
                // How far right it can reach
                r = grid[i][k] == 0 ? 0 : r+1;
                grid[i][k] = Math.min(grid[i][k], r);

                // Top to Bottom
                // How far up it can reach
                u = grid[j][i] == 0 ? 0 : u+1;
                grid[j][i] = Math.min(grid[j][i], u);

                // Bottom to Top
                // How far down it can reach
                d = grid[k][i] == 0 ? 0 : d+1;
                grid[k][i] = Math.min(grid[k][i], d);
            }
        }

        int result = 0;
        for (int[] row : grid) {
            for (int cell : row) {
                result = Math.max(result, cell);
            }
        }

        return result;
    }

}
