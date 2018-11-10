package array.easy;

import java.util.HashMap;
import java.util.Map;


public class DegreeofanArray667 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>(), first = new HashMap<>();
        int res = 0, degree = 0;
        for(int i = 0; i < nums.length; i++){
            first.putIfAbsent(nums[i],i);
            counter.put(nums[i],counter.getOrDefault(nums[i],0)+1);
            if(counter.get(nums[i] )>degree){ // degree : the max number of occurrences of letter
                degree = counter.get(nums[i]); // number of occurrence
                res = i - first.get(nums[i]) +1;

            }else if(counter.get(nums[i]) == degree){
                res = Math.min(res, i-first.get(nums[i])+1);
            }

        }
        return res;
    }
}
