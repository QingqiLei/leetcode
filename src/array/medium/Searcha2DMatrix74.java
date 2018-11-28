package array.medium;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */
public class Searcha2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length  ==0 || matrix[0].length == 0) return false;
        int row = matrix.length, col = matrix[0].length, left = 0;
        int right = row * col -1;
        while( left <= right){
            int mid = left + (right - left)>>2;
            int mid_value = matrix[mid/col][mid % col];
            if(mid_value == target) return true;
            else if(mid_value < target) left = mid +1;
            else right = mid -1;

        }
        return false;
    }
}
