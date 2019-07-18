package array.interval;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InsertInterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[] newInterval1 = newInterval.clone();
        List<int[]> res = new ArrayList<>();

        for(int[] i: intervals){
            if(newInterval1 == null || i[1] < newInterval1[0]) res.add(i);
            else if(i[0] > newInterval1[1]){ // first element after overlapping
                res.add(newInterval1);
                res.add(i);
                newInterval1 = null;
            }
            else{ // overlapping
                newInterval1[0] = Math.min(newInterval1[0], i[0]);
                newInterval1[1] = Math.max(newInterval1[1],i[1]);
            }
        }
        if(newInterval1 != null) res.add(newInterval1);
        new HashSet<Integer>().stream().mapToInt(Integer::intValue).toArray();
        return res.toArray(new int[res.size()][]);
    }
}
