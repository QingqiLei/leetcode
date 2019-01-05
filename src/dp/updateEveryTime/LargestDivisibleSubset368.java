package dp.updateEveryTime;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:
// O(n^2)
public class LargestDivisibleSubset368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        if (nums == null || nums.length == 0) return res;

        int[] count = new int[nums.length]; // count the
        int[] prev = new int[nums.length];
        Arrays.fill(count, 1);
        Arrays.fill(prev, -1);

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] % nums[i] == 0 && count[i] >= count[j]) {
                    count[j] = count[i] + 1;
                    prev[j] = i;
                }
        int max = 1, maxIndex = 0;
        for (int i = 1; i < count.length; i++)
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        while (maxIndex != -1) {
            res.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        return res;

    }
}

