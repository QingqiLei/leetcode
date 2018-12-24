package Math.medium;

import java.util.HashSet;
import java.util.Set;

public class MinimumAreaRectangleII963 {
    public static  double minAreaFreeRect(int[][] points) {
        Set<String> set = new HashSet<>();
        for(int[] i : points)
            set.add(i[0] + " "+ i[1]);
        double res = Double.MAX_VALUE;
        for(int[] p1 : points)
            for(int[] p2: points){
                if (p1[0] == p2[0] && p1[1] == p2[1])
                    continue;

                for(int[] p3 : points){
                    if(p3[0] == p1[0] && p3[1] == p1[1] || p3[0] == p2[0] && p3[1] == p2[1]) continue;
                    if(getDistance(p1, p2) != getDistance(p1, p3) + getDistance(p2, p3)) continue;
                    int x4 = p1[0] + p2[0] - p3[0];
                    int y4 = p1[1] + p2[1] - p3[1];
                    if(!set.contains(x4 +" "+y4)) continue;
                    double area = Math.sqrt(getDistance(p1,p3)) * Math.sqrt(getDistance(p2, p3));
                    res = Math.min(area, res);
                }
            }
        return res == Double.MAX_VALUE? 0:res;
    }
    private static int getDistance(int[] p1, int[] p2){
        return (p1[0] -p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]);
    }
    public static void main(String[] args){
        double t = minAreaFreeRect(new int[][]{{0,3},{1,2},{3,1},{1,3},{2,1}});
        System.out.println(t);

    }
}
