package array.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
// 两种方法
public class MyCalendarI729 {
    List<int[]> arr ;

    public MyCalendarI729() {
        arr = new ArrayList();
    }

    // O(N)
    public boolean book(int start, int end) {
        for(int[] i: arr)
            if(i != null && Math.max(start, i[0])< Math.min(end, i[1])) return false;
            arr.add(new int[]{start, end});
            return true;

    }
}
 class MyCalendarI7292{
    TreeMap<Integer, Integer> map;
    public MyCalendarI7292() {
        map = new TreeMap<>();
    }
    // O(logn)
     public boolean book(int start, int end) {
        Integer low=map.lowerKey(end);                   // 比end 小的存储中的start
         if(low == null || map.get(low) <= start){
             map.put(start,end);
             return true;
         }
return false;
     }
}
