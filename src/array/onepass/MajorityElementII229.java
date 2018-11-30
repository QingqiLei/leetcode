package array.onepass;

import java.util.ArrayList;
import java.util.List;

// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) return ans;
        int A = nums[0];
        int B = nums[0];
        int countA = 0;
        int countB = 0;
        for (int n : nums) {
            if (n == A) {
                countA++;
                continue;
            }
            if (n == B) {
                countB++;
                continue;
            }
            if (countA == 0) {
                A = n;
                countA++;
                continue;
            }
            if (countB == 0) {
                B = n;
                continue;
            }
            countA--;
            countB--;

        }

        countA = 0;
        countB = 0;
        for (int n : nums) {
            if (n == A)
                countA++;
            else if (n == B)
                countB++;
        }
        if (countA > nums.length / 3)
            ans.add(A);
        if (countB > nums.length / 3)
            ans.add(B);
        return ans;
    }
}
