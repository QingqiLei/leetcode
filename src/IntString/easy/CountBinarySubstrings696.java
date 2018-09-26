package IntString.easy;

/**
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 */
public class CountBinarySubstrings696 {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 1, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                cur++;
            else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) res++;
        }
        return res;
    }
}