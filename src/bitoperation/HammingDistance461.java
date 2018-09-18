package bitoperation;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 */
public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
