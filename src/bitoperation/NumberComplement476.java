package bitoperation;

public class NumberComplement476 {
    public int findComplement(int num){
        // ~num: to reverse all the bits, Integer.hightOneBit(num)<<1 -1: make the hightest to lowest all be 1
        return ~num & ((Integer.highestOneBit(num)<<1)-1);

    }
}
