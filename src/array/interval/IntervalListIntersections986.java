package array.interval;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new ArrayList<>();
        for(int i = 0, j = 0; i < A.length && j < B.length; ){
            int left = Math.max(A[i][0], B[j][0]);
            int right = Math.min(A[i][1], B[j][1]);
            if(left <= right) res.add(new int[]{left,right});
            if(A[i][1] < B[j][1]) i++;
            else j++;

        }
        return res.toArray(new int[res.size()][]);
    }
}
