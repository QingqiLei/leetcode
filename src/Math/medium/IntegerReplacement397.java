package Math.medium;

import java.math.BigInteger;

/*
n = 3 or n -1 has less 1s than n +1, decrement n
(if the second last is 0, the last is 1, decrement n. 3 is an exception)
 */
public class IntegerReplacement397 {
    public int integerReplacement(int n) {
        int c = 0;
        while (n != 1) {
            if ((n & 1) == 0)
                n >>= 1;
            else if (n == 3 || ((n >> 1) & 1) == 0)
                --n;
            else ++n;
            ++c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(" " + (2147483647 + 10 >>> 1));
        System.out.println(new BigInteger("2147483647").add(new BigInteger("10")).divide(new BigInteger("2")));
    }
}
