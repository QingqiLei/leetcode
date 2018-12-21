package dfs.medium;

import java.util.Arrays;
/*
Given an array of integers nums and a positive integer k, find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.
 */
public class PartitiontoKEqualSumSubsets698 {
    public static boolean canPartitionKSubsets(int[] nums, int t) {
        if(t > nums.length) return false;
        int sum = 0;
        for(int i: nums)
            sum += i;
        if(sum % t != 0) return false;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        return helper(nums, used,sum/t , 0, nums.length-1, t);
    }
    private static boolean helper(int[] nums, boolean[] used, int target, int currSum,int start,int round){
        if(round == 0) return true;
        if(currSum  == target && helper(nums, used, target, 0, nums.length-1, round -1)) return true;
        for(int i = start; i >=0; i--){
            if(!used[i] && currSum + nums[i] <= target){
                used[i] = true;
                if(helper(nums, used, target, currSum+nums[i],start -1,round) )return true;
                used[i] =false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        canPartitionKSubsets(new int[]{4,3,2,3,5,2,1},4);
    }
}
