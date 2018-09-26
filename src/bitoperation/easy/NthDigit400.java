package bitoperation.easy;

/**
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 */
public class NthDigit400 {
    public int findNthDigit(int n) {
        int len = 1;
        int count = 9;
        int num = 1;
        while (n > len * count) {
            n = n - len * count;
            len++;
            count *= 10;
            num *= 10;
        }

        num += (n - 1) / len;
        String string = String.valueOf(num);
        return string.charAt((n - 1) % n) - '0';
    }
}
