package greedy.medium;

import java.util.Arrays;

public class NonoverlappingIntervals435 {
    // non overlapping 和arrow to burst balloon 差不多，
    public int eraseOverlapIntervals(int[][] I) {
        Arrays.sort(I,(a,b)->(a[1] - b[1]));
        int res = 0,end = Integer.MIN_VALUE;
        for(int[] i: I){
            if(i[0] > end) end = i[1];
            else res++;
        }
        return res;
    }
}
