package bitoperation.easy;

/**
 * check whether it has alternating bits
 */
public class BinaryNumberwithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & (n + 1)) == 0;
    }

    }
