package binarysearch.medium;
/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
You are given a target value to search. If found in the array return true, otherwise return false.
 */
public class SearchinRotatedSortedArrayII81 {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return true;
            if(nums[left] < nums[mid]){
                if(nums[left] <= target && target < nums[mid] ) right = mid;
                else left = mid +1;
            } else if(nums[mid] < nums[left]){
                if(nums[mid] < target && target < nums[left]) left = mid +1;
                else right = mid;
            }else left ++;

        }
        return false;
    }
}
