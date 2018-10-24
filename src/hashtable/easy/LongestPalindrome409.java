package hashtable.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap();
        for (
                Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        boolean oddexist = false;
        int res = 0;
        Set<Map.Entry<Character, Integer>> valueSet = map.entrySet();
        for (
                Map.Entry<Character, Integer> i : valueSet) {
            res += i.getValue() / 2 * 2;
            if (!oddexist && i.getValue() % 2 == 1)
                oddexist = true;

        }
        System.out.println(res);
        System.out.println(oddexist);
        return oddexist ? res + 1 : res;

    }
}
