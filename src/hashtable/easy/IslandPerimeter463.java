package hashtable.easy;

/**
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int count = 0, neighbour = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    if (i != grid.length - 1 && grid[i + 1][j] == 1) neighbour++;
                    if (j != grid[i].length - 1 && grid[i][j + 1] == 1) neighbour++;
                }
            }
        }

        return count * 4 - 2 * neighbour;
    }
}
