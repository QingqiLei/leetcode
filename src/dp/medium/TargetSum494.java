package dp.medium;
/*
You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.
 */
public class TargetSum494 {
    public int findTargetSumWays(int[] nums, int s) {
        int sum = 0;
        for(int i : nums)
            sum += i;
        return sum < s || (s + sum )%2>0 ? 0:subsetSum(nums,(s+sum)>>1);
    }
    public int subsetSum(int[] nums, int s) {
        int res = 0;
        int[] dp = new int[s+1];
        dp[0] = 1;
        for(int n :nums)
            for(int i = s; i >= n; i--)

            dp[i] +=dp[i-n];
            return dp[s];
    }
    public static void main(String[] args){
        System.out.println(-4 >>>1);
    }
}
