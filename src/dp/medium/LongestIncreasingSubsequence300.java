package dp.medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS1(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = upper_bound(tails, size, x);
            tails[i] = x;
            if (i == size) size++;
        }
        return size;
    }

    private int upper_bound(int[] tails, int end, int target) {
        int left = 0, right = end;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (tails[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++)
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
