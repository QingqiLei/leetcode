package bitoperation.easy;

/**
 * prime number 素數
 */
public class PrimeNumberofSetBits762 {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        while(L <= R)
            count += 665772 >> Integer.bitCount(L++) & 1;
        return count;
    }
    }
