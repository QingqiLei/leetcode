package array.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyCalendarII731 {
    private List<int[]> books = new ArrayList<>();
    private List<int[]> overlap = new ArrayList<>();

    public boolean book(int start, int end) {
        for(int[] lap : overlap)
            if(end > lap[0] && lap[1] > start ) return false;
            for(int[] book : books)
                if(end  > book[0] && book[1] > start) overlap.add(new int[]{Math.max(book[0], start), Math.min(book[1], end)});
                books.add(new int[]{start, end});
            return true;
    }

    private TreeMap<Integer, Integer> map  = new TreeMap<>();
    public boolean book1(int start, int end) {
        map.put(start,map.getOrDefault(start,0 )-1 );
        map.put(end,map.getOrDefault(end,0 )-1 );
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            count += entry.getValue();
            if(count > 2) {
                if(map.get(start) == 1) map.remove(start);
                else map.put(start, map.get(start)-1);
                if(map.get(end) == 1) map.remove(end);
                else map.put(end,map.get(end) +1);
                return false;
            }
        }
        return true;
    }


}
