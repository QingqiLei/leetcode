package array.easy;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // !!!!!!
        reverse(nums, 0, nums.length - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, k - 1);

    }

    private void reverse(int[] nums, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
