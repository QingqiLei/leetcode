package IntString.ilike;

/**
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start = -1, end = s.length();

        while (start < end) {
            if (s.charAt(++start) != s.charAt(--end)) {
                return isPalindrome(s, start - 1, end) || isPalindrome(s, start, end + 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(++start) != s.charAt(--end)) return false;
        }
        return true;
    }
}
