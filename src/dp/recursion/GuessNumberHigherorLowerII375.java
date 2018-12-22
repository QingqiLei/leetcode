package dp.recursion;

public class GuessNumberHigherorLowerII375 {
    public int getMoneyAmount(int n) {
        // dp[m][n](including m and n): means: money guarantees a win in range[m,n](including)

        int[][] dp = new int[n+1][n+1];
        return find(dp, 1, n);

    }
    private int find(int[][] dp, int start, int end){
        if(start >= end ) return 0; // if start >= end, return 0
        if(dp[start][end] != 0)return dp[start][end];
        int res = Integer.MAX_VALUE;

        for(int x = start; x <= end; x++){
            int tmp = x+Math.max(find(dp,start,x-1), find(dp, x+1, end));
            res = Math.min(res, tmp);
        }
        dp[start][end] = res; // update
        return dp[start][end];
    }
}
