package dp.medium;

import java.util.Arrays;

public class PartitionEqualSubsetSum416 {

    public boolean canPartition1(int[] nums) {
        int sum = 0;
        for(int i: nums)
            sum += i;
        if(sum %2 != 0) return false;
        sum /=2;

        boolean[][] dp = new boolean[nums.length +1][sum +1];
        for(int i = 0; i < nums.length+1; i++)
            dp[i][0] = true;
        for(int i  = 1; i < nums.length +1; i++)
            for(int j = 1; j < sum +1; j++){
                dp[i][j] = dp[i-1][j];
                if(j >= nums[i-1])
                    dp[i][j] = dp[i][j] || dp[i-1][ j - nums[i -1]];
            }
        return dp[nums.length][sum];

    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums)
            sum += i;
        if(sum %2 != 0) return false;
        sum /=2;
        boolean[] dp = new boolean[sum +1];
        dp[0] = true;
        for(int num : nums){
            for(int i = sum; i >= num; i--)
                dp[i] = dp[i] || dp[i - num];

        }
        return dp[sum];

    }








    public static boolean canPartition2(int[] nums) { // TLE
        int sum = 0;
        for(int i: nums)
            sum +=i;
        if(sum %2 != 0) return false;
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        return canPartition(nums, used, sum /2, 0, nums.length-1,2);
    }
    private static boolean canPartition(int[] nums, boolean[] used, int target, int currSum,int start,int round){
        if(round == 0) return true;
        if(currSum == target && canPartition(nums, used, target, 0, nums.length-1,round -1)) return true;

        for(int i = start ; i >=0; i--){
            if(!used[i] && nums[i] + currSum <= target){
                used[i] = true;
                if(canPartition(nums, used, target, nums[i] + currSum, start -1,round)) return true;
                used[i] = false; ///!!!
            }


        }
        return false;
    }
}
