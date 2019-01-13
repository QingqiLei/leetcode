package dp.medium;

import java.util.HashSet;
import java.util.Set;

public class ContinuousSubarraySum523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        k = k == 0 ? Integer.MAX_VALUE : Math.abs(k);
        if ((nums.length) / 2 >= k) return true;
        Set<Integer> set = new HashSet<>(); // store the prefix mod
        int last = 0;
        for (int num : nums) {
            int cur = (last + num) % k;
            if (set.contains(cur)) return true;
            set.add(last);
            last = cur;
        }
        return false;
    }
}
