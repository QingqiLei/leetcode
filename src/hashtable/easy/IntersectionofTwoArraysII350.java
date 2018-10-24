package hashtable.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 */
public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }

        for (int i : nums2) {
            Integer j = map.get(i);
            if (j != null && j > 0) {
                map.put(i, j - 1);
                res.add(i);
            }
        }
        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);

        }
        return ans;

    }
}
