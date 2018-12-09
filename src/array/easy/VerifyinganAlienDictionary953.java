package array.easy;

import java.util.HashMap;
import java.util.Map;

public class VerifyinganAlienDictionary953 {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++)
            map.put(order.charAt(i), i);
        for (int i = 0; i < words.length - 1; i++)
            if (!comparaTwoWords(words[i], words[i + 1], map)) return false;
        return true;
    }

    private boolean comparaTwoWords(String w1, String w2, Map<Character, Integer> order) {
        if (w1.contains(w2) && w2.length() < w1.length()) return false;
        for (int i = 0, j = 0; i < w1.length() && j < w2.length(); i++, j++)
            return order.get(w2.charAt(j)) - order.get(w1.charAt(i)) > 0 ? true : false;
        return true;
    }
}
