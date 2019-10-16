package array.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumAreaRectangle939 {
    public int minAreaRect(int[][] points) {
        Map<Integer, Set<Integer>> map = new HashMap();
        for(int[] a : points){
            if(!map.containsKey(a[0])){
                map.put(a[0], new HashSet<Integer>());
            }
            map.get(a[0]).add(a[1]);
        }
        int res = Integer.MAX_VALUE;
        for(int[] i :points){
            for(int[] j :points){
                if(i[0] == j[0] || i[1] == j[1]) continue;
                if(map.get(i[0]).contains(j[1]) && map.get(j[0]).contains(i[1]))
                    res = Math.min(res, Math.abs((i[0] - j[0]) * ( i [1] - j[1])));
            }
        }
        return res == Integer.MAX_VALUE?0:res;
    }
}
