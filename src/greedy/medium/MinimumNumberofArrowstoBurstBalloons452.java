package greedy.medium;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons452 {
    // 就是按照这个过程，想通了就好了
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (a,b)->(a[1] - b[1]));
        int arrowPos = points[0][1];
        int res  = 1;
        for(int i = 0; i < points.length; i++){
            if(points[i][0] < arrowPos) continue;
            res++;
            arrowPos = points[i][1];
        }
        return res;
    }
}
