package binarysearch.medium;
/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 */
public class FindMinimuminRotatedSortedArrayII154 {

    // contains duplicates
    public int findMin(int[] nums) {
        int left = 0, right = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]) left = mid+1;
            else if(nums[mid] < nums[right]) right = mid;
            else right--;
        }
        return nums[left];
    }

    // unique
    public int fildMin(int[] nums){
        int left = 0, right = nums.length;
        while(left < right){
            int mid = left + ( right - left) /2;
            if(nums[mid] > nums[right]) left = mid +1;
            else if(nums[mid] < nums[right]) right = mid;
        }
        return nums[left];
    }

}
