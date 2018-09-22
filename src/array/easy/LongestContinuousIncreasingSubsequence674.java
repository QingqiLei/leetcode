package array.easy;

/**
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 */
public class LongestContinuousIncreasingSubsequence674 {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] <= nums[i - 1])
                count = 1;
            else
                count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
