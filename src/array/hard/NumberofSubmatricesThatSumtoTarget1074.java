package array.hard;

import java.util.HashMap;
import java.util.Map;

public class NumberofSubmatricesThatSumtoTarget1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, res = 0;
        for(int left = 0; left < n; left ++){
            int[] sums = new int[m];
            for(int right  = left; right < n; right ++){
                Map<Integer,Integer> map = new HashMap<>();
                map.put(0,1);
                int cur = 0;
                for(int i = 0; i < m; i++) {
                    sums[i] += matrix[i][right];
                    cur+= sums[i];
                    res+= map.getOrDefault(cur - target,0);
                    map.put(cur,map.getOrDefault(cur,0)+1);
                }
            }
        }
        return res;
    }
}
