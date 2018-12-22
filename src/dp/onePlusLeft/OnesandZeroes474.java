package dp.onePlusLeft;

public class OnesandZeroes474 {

    // Time Complexity: O(KL + KMN) K is the length of input array, l is the average length of strings in the array
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[m][n]: means that result of m zeros and n ones,
        // for every str in strs, update every dp[zero][one] that zero >= zeros in str and one >= ones in str.
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int[] count = count(s);
            for (int zero = m; zero >= count[0]; zero--) {
                for (int one = n; one >= count[1]; one--)
                    dp[zero][one] = Math.max(dp[zero][one], dp[zero - count[0]][one - count[1]]);
            }
        }
        return dp[m][n];
    }

    private int[] count(String str){
        int[] res = new int[2];
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0') res[0]++;
            else res[1]++;
        }
        return res;
    }
}
