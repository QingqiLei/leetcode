package twopointer.medium;
/*
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.


 */
public class MinimumSizeSubarraySum209 {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE, sum = 0, left = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s){
                res = Math.min(i - left +1,res );
                sum -=nums[left++];
            }
        }
        return res == Integer.MAX_VALUE?0:res;
    }
}
