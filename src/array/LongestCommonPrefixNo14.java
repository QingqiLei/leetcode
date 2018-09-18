package array;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * 理解String 的comparaTo的作用。
 */
public class LongestCommonPrefixNo14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs != null && strs.length != 0)
            Arrays.sort(strs);
        else
            return result.toString();

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (last.length > i && last[i] == first[i])
                result.append(first[i]);
            else
                return result.toString();
        }
        return result.toString();
    }
}
