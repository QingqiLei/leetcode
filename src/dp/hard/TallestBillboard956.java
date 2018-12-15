package dp.hard;

import java.util.Arrays;

public class TallestBillboard956 {
    public int tallestBillboard(int[] rods) {
        if(rods == null || rods.length ==0) return 0;
        int sum = 0;
        for(int rod : rods)
            sum += rod;
        int[] dp = new int[sum +1];
        Arrays.fill(dp,1,dp.length,-1);
        for(int rod: rods){
            int[] prev = dp.clone();
            for(int j = 0; j  + rod <= sum; j++){
                if(prev[j] == -1) continue;
                dp[j + rod] = Math.max(dp[j + rod],prev[j]);
                dp[Math.abs(rod - j)] = Math.max(dp[Math.abs(rod - j)], prev[j] + Math.min(rod, j));

            }
        }
        return dp[0];
    }
}
