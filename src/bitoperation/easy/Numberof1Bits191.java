package bitoperation.easy;

public class Numberof1Bits191 {
    public int hammingWeight(int n){
//        return Integer.bitCount(n);
        int count = 0;
        while(n != 0){
            count += (n & 1);
            n >>=1;
        }
        return count;
    }
}
