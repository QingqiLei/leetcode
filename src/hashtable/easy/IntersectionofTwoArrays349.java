package hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 */
public class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            if (set1.contains(nums2[i])) {
                res.add(nums2[i]);
                set1.remove(nums2[i]);
            }
        }
        int[] ans = new int[res.size()];
        int i = 0;
        for (Integer num : res) {
            ans[i++] = num;
        }
        return ans;
    }


}
