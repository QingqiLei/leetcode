package bitoperation.easy;

/**
 * check whether it has alternating bits
 */
public class BinaryNumberwithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & (n + 1)) == 0;
    }

    public static void main(String[] args){
        System.out.println(Integer.bitCount(1000000));

        System.out.println(Integer.toBinaryString(16).length()-1);
        int n = 34;
        StringBuilder s =  new StringBuilder(Integer.toBinaryString(n)).reverse();
        Integer.valueOf(s.toString(),2);
        System.out.println(Integer.valueOf(s.toString(),2));
        System.out.println(Integer.MAX_VALUE);


    }
    }
