package array.onepass;

import java.util.Arrays;
/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest16 {
    public static  int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int left2 = i + 1, right = nums.length - 1;
            while (left2 < right) {
                int sum = nums[i] + nums[left2] + nums[right];
                if (Math.abs(sum - target) < Math.abs(res - target))
                    res = sum;
                if (sum > target) {
                    right--;
                } else left2++;
            }
        }
        return res;

    }
    public static void main(String[] args){
        int b = threeSumClosest(new int[]{-1,2,1,-4},1);
        System.out.println(b);

    }
}
