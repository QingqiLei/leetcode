package array.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 */
public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        if(matrix.length == 0 || matrix[0].length == 0) return ans;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(true){
            for(int i = left; i <= right; i++) ans.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) ans.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) ans.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) ans.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;



        }
        return ans;

    }
}
