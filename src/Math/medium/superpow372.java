package Math.medium;

public class superpow372 {

    public static int superPow(int a, int[] b) {
        if (a % 1337 == 0) return 0;
        int p = 0;
        for (int i : b) p = (p * 10 + i) % 1140; // 1140 is 欧拉函数算出来的额1337
        if (p == 0) p += 1440;
        return power(a, p, 1337);
    }

    static int power(int a, int n, int mod) {
        a %= mod;  // 积的取余等于取余的积取余
        int ret = 1;
        while (n != 0) {
            if ((n & 1) != 0) ret = ret * a % mod;
            a = a * a % mod;  /// !!!  2^80 = 2^40 * 2^40 = 4^40
            n >>= 1;
        }
        return ret;
    }

    public static long power1(long x, long n, long p) {
        if (n == 0)
            return 1;

        long tmp = power1((x * x) % p, n / 2, p);

        if (n % 2 != 0)
            tmp = (tmp * x) % p;

        return tmp;
    }


    static int pow1(int a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;
        int result = pow1(a, n / 2);
        result = result * result;
        if (n % 2 == 1) result = result * a;
        return result;
    }


    static int pow3(int a, int n) {
        int result = 1;
        while (n != 0) {
            if (n % 2 == 1) result = result * a;
            a = a * a; // !!!!!
            n = n >> 1;
        }
        return result;
    }


}
