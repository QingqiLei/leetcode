package IntString;

import java.math.BigDecimal;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 */
public class RansomNote383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
return true;
    }

    public static void main(String[] args){
        System.out.println(canConstruct("aaa","aa"));
        int[] m = new int[1];
        System.out.println(m[0]);
        System.out.println("as".indexOf("a"));
        System.out.println(Integer.valueOf("11",2));
        Integer int1 = Integer.valueOf("1",2);
        Integer int2 = Integer.valueOf("11",2);
        Integer int3 = int1 + int2;
        System.out.println(Integer.toBinaryString(int3));


    }
}
