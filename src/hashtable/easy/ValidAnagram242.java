package hashtable.easy;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 */
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];

        for (int i = 0; i < s.length(); i++) array[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) array[t.charAt(i) - 'a']--;
        for (int i : array) if (i != 0) return false;
        return true;
    }
}
