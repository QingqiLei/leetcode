package dp.recursion;

public class KnightDialer935 {
    int[][] graph = new int[][]{{4, 6}, {6, 8}, {7, 9}, {4, 8}, {3, 9, 0}, {}, {1, 7, 0}, {2, 6}, {1, 3}, {2, 4}};
    private static final int MOD = 1000000007;

    public int knightDialer(int N) {
        Integer[][] memo = new Integer[N + 1][10];
        int res = 0;
        for (int i = 0; i <= 9; i++)
            res = (res + helper(N - 1, i, memo)) % MOD;
        return res;

    }

    private int helper(int round, int cur, Integer[][] memo) {
        if(round == 0) return 1;
        if(memo[round][cur] != null) return memo[round][cur];
        int res = 0;
        for(int i: graph[cur]){
            res = (res + helper(round -1, i, memo))% MOD;

        }
        memo[round][cur] = res;
        return res;
    }
}
