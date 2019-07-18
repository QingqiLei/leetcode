package array.interval;

import java.util.TreeMap;

public class MyCalendarIII732 {
    TreeMap<Integer, Integer> timeLine = new TreeMap<>();
    public int book(int start, int end) {
        timeLine.put(start,timeLine.getOrDefault(start,0  ) +1);
        timeLine.put(end, timeLine.getOrDefault(end,0 )-1);
        int ongoing =  0,res = 0;
        for(int k: timeLine.values()) res = Math.max(res, ongoing += k);
        return res;
    }
}
