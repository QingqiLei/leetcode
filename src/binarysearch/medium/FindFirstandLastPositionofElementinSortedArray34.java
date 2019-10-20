package binarysearch.medium;

import binarysearch.FirstEqualGreater;
import binarysearch.LastEqualLess;

import static binarysearch.FirstEqualGreater.firstEqualGreater;
import static binarysearch.LastEqualLess.lastEqualLess;

// find the higher_bound
public class FindFirstandLastPositionofElementinSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int left = firstEqualGreater(nums, target);
        if (left == nums.length || nums[left] != target) return new int[]{-1, -1};
        return new int[]{left, lastEqualLess(nums, target) };
    }
}
