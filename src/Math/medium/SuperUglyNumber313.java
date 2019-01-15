package Math.medium;

import java.util.Arrays;

public class SuperUglyNumber313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length]; // numbers of pow
        int[] val = new int[primes.length]; // candidates
        Arrays.fill(val, 1);
        int next = 1;
        for (int i = 0; i < n; i++) {
            ugly[i] = next;
            next = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                if (val[j] == ugly[i]) val[j] = ugly[idx[j]++] * primes[j]; // update
                next = Math.min(next, val[j]); // find the minimum of the candidates
            }
        }
        return ugly[n - 1];
    }
}
