package bitoperation.easy;

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerofTwo231 {
    public boolean isPowerOfTwo(int n){
        if(n<0) return false;
        if(Integer.bitCount(n) == 1) return true;
        return false;
    }
}
