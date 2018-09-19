package array;

import java.util.Arrays;

/**
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
 *
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 */
public class ReshapetheMatrix566 {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length*nums[0].length != r*c) return nums;

        int[][] result = new int[r][c];

        for(int i = 0; i < r*c; i ++){
            result[i/c][i%c] = nums[i/nums[0].length][i%nums[0].length];
        }
        return result;
    }
    public static void main(String[] args){
        int[][] array = {{1,2},{3,4}};
        System.out.println(Arrays.toString(matrixReshape(array,1,4)));

    }
}
