package stack.easy;

/**
 * On a N * N grid, we place some 1 * 1 * 1 cubes.
 *
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 *
 * Return the total surface area of the resulting shapes.
 */
public class SurfaceAreaof3DShapes892 {
    public int surfaceArea(int[][] grid) {
        int res = 0;
    if(grid == null || grid.length == 0 || grid[0].length == 0) return res;
    for(int i = 0; i < grid.length;i++){
        for(int j = 0; j < grid[i].length ;j ++){
            res += grid[i][j]*6;
            if(grid[i][j] > 1) res -= (grid[i][j]-1)*2;
            if( i - 1 >=0) res -= Math.min(grid[i][j],grid[i -1][j])*2;
            if(j - 1 >=0) res -= Math.min(grid[i][j-1],grid[i][j])*2;
        }
    }
    return res;
    }

}
