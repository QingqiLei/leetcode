package dp.medium;
//Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
public class MaximalSquare221 {
    //O(n * m)
    public int maximalSquare(char[][] matrix){
        if(matrix.length == 0) return 0;
        int[][] array = new int[matrix.length+1][matrix[0].length+1];
        int res = 0;
        for(int i = 1;i  <= matrix.length; i++)
            for(int j = 1; j <=matrix[0].length; j++){
                if(matrix[i-1][j-1] == '1'){
                    // 三个正方形， 取最小的，
                    array[i][j] = Math.min(Math.min(array[i][j-1], array[i-1][j]), array[i-1][j-1])+1;
                    res = Math.max(res, array[i][j]);
                }

            }
        return res * res;
    }
}
