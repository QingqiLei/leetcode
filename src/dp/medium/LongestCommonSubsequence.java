package dp.medium;

public class LongestCommonSubsequence {
    public static int get(String A, String B) {
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        int res = 0;
        for (int i = 1; i <= A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                char c1 = A.charAt(i - 1);
                char c2 = B.charAt(j - 1);
                if (c1 == c2)
                    dp[i][j] = dp[i - 1][j - 1] + 1;


                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }
        return dp[A.length()][B.length()];
    }

    public static void main(String[] args) {
        System.out.println(get("a1b2c3d3", "5ab9c82d87"));
    }

}
