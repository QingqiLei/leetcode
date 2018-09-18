package IntString;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumberNo9 {
    public boolean isPalindrome(int x) {
        int y = 0;
        int xx = x;
        while (xx > 0) {
            y = y * 10 + xx % 10;
            xx = xx / 10;
        }
        return y == x;
    }
}
