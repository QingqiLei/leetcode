package binarysearch.easy;

/**
 * just a binary search
 */
public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int front = nums.length - 1;
        int start = 0;
        while (front > start) {
            int mid = (front - start) / 2 + start;
            if (nums[mid] > target) front = mid - 1;
            else if (nums[mid] < target) start = mid + 1;
            else return mid;
        }
        return -1;
    }


}
