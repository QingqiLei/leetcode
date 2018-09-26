package IntString.easy;

/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 */
public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,s.length()*2 -1).contains(s);
    }
}
