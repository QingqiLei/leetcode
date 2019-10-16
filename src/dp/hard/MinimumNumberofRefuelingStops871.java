package dp.hard;

public class MinimumNumberofRefuelingStops871 {
    public int minRefuelStops(int target, int startFuel, int[][] s) {
        long[] dp = new long[s.length + 1];
        dp[0] = startFuel;
        // 对每一个加油站，只要dp【t】>=s[i][0]， 就更新，dp【t+1】
        for (int i = 0; i < s.length; i++) {
            for (int t = i; t >= 0 && dp[t] >= s[i][0]; t--)
                dp[t + 1] = Math.max(dp[t + 1], dp[t] + s[i][1]);
        }
        for (int i = 0; i < dp.length; i++)
            if (dp[i] >= target) return i;
        return -1;
    }
}
