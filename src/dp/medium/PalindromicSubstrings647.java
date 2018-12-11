package dp.medium;

/*
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 */
public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += expend(s, i, i);
            if (i < s.length() - 1)
                res += expend(s, i, i + 1);
        }
        return res;
    }

    private int expend(String s, int start, int end) {
        int res = 0;
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start--) == s.charAt(end++))
                res++;
            else
                break;
        }
        return res;
    }
}
