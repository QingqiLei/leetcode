package binarysearch.medium;

public class SearchinRotatedSortedArray33 {
    public static  int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) return mid;

            else if (nums[left] < nums[mid]) {
                if (target >= nums[left] && target <= nums[mid])
                    right = mid - 1;
                else left = mid + 1;
            } else if (nums[left] > nums[mid])
                if (target > nums[mid] && target < nums[left]) left = mid + 1;
                else right = mid - 1;
            else left++;
        }

        return -1;
    }
    public static  int search1(int[] nums, int target) {

        int left = 0, right = nums.length; // !!!
        while (left < right) {            // !!!
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) return mid;

            else if (nums[left] < nums[mid]) {
                if (target >= nums[left] && target <= nums[mid])
                    right = mid ;                // !!!
                else left = mid + 1;
            } else if (nums[left] > nums[mid])
                if (target > nums[mid] && target < nums[left]) left = mid + 1;
                else right = mid ;               // !!!
            else left++;
        }
        return -1;
    }
    public static void main(String[] args){
        int i = search(new int[]{}, 4);
        System.out.println(i);
    }
}
