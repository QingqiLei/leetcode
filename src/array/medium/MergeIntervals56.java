package array.medium;

import java.util.*;

public class MergeIntervals56 {
    public int[][] merge(int[][] intervals){
        List<int[]> res = new ArrayList<>();
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int[] curr = intervals[0];
        res.add(curr); // 如果不先加入， 那么需要在下面for循环结束后再add()
        for(int[] iter: intervals){
            if(curr[1] >= iter[0]){
                curr[1] = Math.max(curr[1],iter[1] );
            }else{
                res.add(curr);
                curr = iter;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}


