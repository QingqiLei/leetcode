package bitoperation.easy;

public class ReverseBits190 {
    public int reverseBits(int n) {
        if(n ==0) return 0;
        int result = 0;
        for(int i = 0 ; i < 32; i++){
            result <<= 1; // *2
            if((n & 1) ==1) result++; // +1
        }
        return result;
    }

    }
