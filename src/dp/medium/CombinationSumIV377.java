package dp.medium;

import java.util.Arrays;

public class CombinationSumIV377 {

    public int combinationSum4(int[] nums, int target){
        int[] comb = new int[target +1];
        comb[0] = 1;
        for(int i = 1; i < comb.length;i++){
            for(int j = 0; j < nums.length; j++){
                if(i - nums[j] >=0)
                    comb[i] += comb[i-nums[j]];
            }

        }
        return comb[target];
    }

    public int combinationSum41(int[] nums, int target) {
        int[] dp = new int[target +1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target,dp);


    }
    private int helper(int[] nums, int target,int[] dp){
        if(dp[target] != -1) return dp[target];
        int res = 0;
        for(int i = 0; i < nums.length; i++)
            if(target >= nums[i])
                helper(nums,  target - nums[i],dp);
            dp[target] = res;
            return res;
    }
}
