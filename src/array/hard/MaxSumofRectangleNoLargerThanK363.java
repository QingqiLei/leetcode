package array.hard;

import java.util.TreeSet;

public class MaxSumofRectangleNoLargerThanK363 {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length, col = matrix[0].length;
        int min = Math.min(row, col), max = Math.max(row, col), res = Integer.MIN_VALUE;
        for(int left = 0; left < min; left++){
            int[] sums = new int[max];
            for(int right =  left ; right < min; right++){
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                int cur  = 0;
                for(int i = 0; i < max; i++){
                    sums[i] = sums[i] + (row > col? matrix[i][right] : matrix[right][i]);
                    cur += sums[i];
                    Integer num = set.ceiling(cur - k);
                    if(num != null) res = Math.max(res,cur - num);
                    set.add(cur);
                }
            }
        }
        return res;
    }
}
