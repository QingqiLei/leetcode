package array.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0, sum = 0;
        for (int i : nums) {
            sum += i;
            Integer temp = map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0 ) + 1);
            if (temp != null) res += temp;
        }
        return res;
    }
}
