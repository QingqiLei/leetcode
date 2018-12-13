package dp.medium;
/*
Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:

Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
Given a number n. You have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.
 */
public class KeysKeyboard650 {
    public int minSteps(int n) {
        int res = 0;
        int[] dp = new int[n+1];

        for(int i = 2; i <=n;i++){
            dp[i] =i;
            for(int j = i-1; j > 1;j--)
                if(i % j == 0)
                    dp[i] = dp[j] + (i/j);
                break;
        }
        return dp[n];
    }
}
