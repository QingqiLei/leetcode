package bitoperation.easy;

/**
 *
 */
public class PowerofThree326 {
    public boolean isPowerOfThree(int n) {
        if(n > 1){
            while( n%3 == 0) n = n /3;

        }
        return n == 1;
    }
}
