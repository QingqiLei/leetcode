package array.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberofMatchingSubsequences792 {
    public int numMatchingSubseq(String S, String[] words) {
        Set<String> yesSet = new HashSet<String>();
        Set<String> noSet = new HashSet<String>();
        int count = 0;
        for (String word : words) {
            if (yesSet.contains(word)) {
                count++;
                continue;
            }
            if (noSet.contains(word)) continue;
            boolean isSub = isSubseq(S, word);
            if (isSub) {
                yesSet.add(word);
                count++;

            } else noSet.add(word);

        }
        return count;
    }

    public boolean isSubseq(String s, String w) {
        int index = -1;
        for (char a : w.toCharArray()) {
            index = s.indexOf(a, index + 1);
            if (index == -1) return false;
        }
        return true;
    }
}
