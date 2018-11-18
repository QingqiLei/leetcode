package array.medium;

import java.util.Arrays;

public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length ; i ++) for(int j = 0; j < grid[i].length; j++){
            if(i == 0 && j == 0) continue;
            else if( i ==0) grid[i][j] += grid[i][j-1];
            else if( j ==0) grid[i][j] += grid[i-1][j];

            else grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
        }
        for(int i = 0; i < grid.length; i ++) System.out.println(Arrays.toString(grid[i]));
        return grid[grid.length-1][grid[0].length-1];
    }
}
