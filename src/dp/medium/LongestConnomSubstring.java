package dp.medium;

public class LongestConnomSubstring {
    public static int get(String A, String B) {
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        int res = 0;
        for (int i = 1; i <= A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                char c1 = A.charAt(i - 1);
                char c2 = B.charAt(j - 1);
                if (c1 == c2)
                    dp[i][j] = dp[i - 1][j - 1] + 1;


                else dp[i][j] = 0;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(get("abcd123213212", "324abcd8945984"));
    }

}
