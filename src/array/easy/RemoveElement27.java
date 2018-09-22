package array.easy;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 */
public class RemoveElement27 {
    public int removeElement(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i ++){
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
