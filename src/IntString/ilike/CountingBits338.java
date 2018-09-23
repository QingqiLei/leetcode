package IntString.ilike;

import java.util.Arrays;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 */
public class CountingBits338 {
    public static int[] countBits(int num) {

        int[] result = new int[num + 1];
        for (int i=1; i<=num; i++) result[i] = result[i >> 1] + (i & 1);
        return result;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(countBits(3)));
        System.out.println(Integer.toBinaryString(30));
    }
}

// i >> 1  相当于 i /2,     i & 1 相当于 i%2