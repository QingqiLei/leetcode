package bitoperation.easy;

public class PowerofFour342 {
    public boolean isPowerOfFour(int num) {
        if(num < 0 || Integer.bitCount(num) != 1) return false;
        return (Integer.toBinaryString(num).length() -1) %2 == 0 ;
    }

    }
