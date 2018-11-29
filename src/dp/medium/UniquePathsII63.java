package dp.medium;

public class UniquePathsII63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] ==1) return 0;
        int[][] temp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1) break;
            temp[i][0] =1;
        }

        for(int i = 0; i < obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 1) break;
            temp[0][i] =1;
        }
        for(int i = 1; i <obstacleGrid.length; i++)
            for(int j = 1; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] == 1) continue;

                int left = 0, top = 0;
                if(obstacleGrid[i-1][j] == 0) top = temp[i-1][j];
                if(obstacleGrid[i][j-1] == 0) left = temp[i][j-1];
                temp[i][j] = left + top;
            }
        return temp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
    public static void main(String[] args){
        int n = uniquePathsWithObstacles(new int[][]{{0,0},{1,1},{0,0}});
        System.out.println(n);
    }
}
