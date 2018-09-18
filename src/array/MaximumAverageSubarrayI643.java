package array;

/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 */
public class MaximumAverageSubarrayI643 {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        long max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            Math.max(max, sum);
        }
        return max / 1.0 / k;
    }
}
