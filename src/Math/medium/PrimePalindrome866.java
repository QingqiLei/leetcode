package Math.medium;

public class PrimePalindrome866 {
    public int primePalindrome(int N) {

        if (8 <= N && N <= 11) return 11;   //11 is the only even-palindrome that's prime.

        for (int i = 0; i < 100000; i++) {
            int p = getOddPalindrome(i);
            if (p >= N && isPrime(p)) {
                return p;
            }
        }
        return -1;
    }

    int getOddPalindrome(int i) {
        String s = Integer.toString(i), r = new StringBuilder(s).reverse().substring(1);
        return Integer.parseInt(s + r);
    }

    boolean isPrime(int num) {
        if (num <= 3) return num > 1;
        if (num % 6 != 1 && num % 6 != 5) return false;
        int s = (int) Math.sqrt(num);
        for (int i = 5; i <= s; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
