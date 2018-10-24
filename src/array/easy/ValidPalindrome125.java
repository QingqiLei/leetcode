package array.easy;

/**
 *
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String revese = new StringBuffer(actual).reverse().toString();
        return actual.equals(revese);
    }

}
