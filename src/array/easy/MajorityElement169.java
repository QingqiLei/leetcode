package array.easy;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * the majority is more than n/2 and always exist
 */
public class MajorityElement169 {
    public static int majorityElement(int[] nums) {
        int major = nums[0], count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];  // change the selected majority
            } else if (major == nums[i]) {
                count++;
            } else count--;
        }
        return major;
    }


}
