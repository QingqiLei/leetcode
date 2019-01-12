package array.medium;

import java.util.Arrays;

public class CoinChange322 {

    // dfs TLE
    public static int coinChange(int[] coins, int amount) {
        int res = helper(coins, amount, 0, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static int helper(int[] coins, int target, int start, int num) {
        if (target == 0) return num;
        if (target < 0) return -1;
        if (start >= coins.length) return -1;

        int res = Integer.MAX_VALUE;
        while (target >= 0) {
            int tmp = helper(coins, target, start + 1, num);
            res = tmp == -1 ? res : Math.min(res, tmp);
            target -= coins[start];
            num++;
        }
        return res;
    }

    // dfs fastest solution
    int minCount = Integer.MAX_VALUE;

    public int coinChange1(int[] coins, int amount) {

        Arrays.sort(coins);
        count(amount, coins.length - 1, coins, 0);
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    void count(int amount, int index, int[] coins, int count) {
        if (amount % coins[index] == 0) {
            minCount = Math.min(minCount, count + amount / coins[index]);
            return;
        }

        if (index == 0) return;
        for (int i = amount / coins[index]; i >= 0; i--) {
            int newAmount = amount - i * coins[index];
            int newCount = count + i;
            int nextCoin = coins[index - 1];
            if (newCount + (newAmount + nextCoin - 1) / nextCoin >= minCount) return;

            count(newAmount, index - 1, coins, newCount);

        }
    }


    // DP DP[i] means the result of amount i
    public int coinChange2(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        Arrays.fill(f, amount + 1);
        f[0] = 0;

        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                f[i] = Math.min(f[i], f[i - coin] + 1);

        return f[amount] == amount + 1 ? -1 : f[amount];
    }


}
