package Math.medium;

/*
Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
 */
public class CountNumberswithUniqueDigits357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10, last = 9, curr = 9;
        while (n-- > 1 && curr > 0) {
            last *= curr;
            res += last;
            curr--;
        }
        return res;
    }
}
