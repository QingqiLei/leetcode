package array.medium;

import java.util.HashMap;
import java.util.Map;

public class TaskScheduler621 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: tasks)
            map.put(c ,map.getOrDefault(c,0 )+1 );

        int max = 0;
        for(int val : map.values())
            max= Math.max(val, max );

        int p = 0;
        for(int val : map.values())
            if(val == max)
                p++;

            int total = (max - 1) * ( n +1)+ p;
            if(total < tasks.length) return  tasks.length;
            else return total;
    }
}
