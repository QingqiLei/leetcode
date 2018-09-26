package IntString.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * 这道题的一个技巧就是从字符串的后面往前面计算
 */
public class BackspaceStringCompare844 {
    public boolean backspaceCompare(String S, String T) {
        List<Character> s = new ArrayList<>();
        List<Character> t = new ArrayList<>();
        int SB = 0;
        int TB = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '#')
                SB++;
            else {
                if (SB > 0)
                    SB--;
                else
                    s.add(S.charAt(i));
            }
        }

        for (int i = T.length() - 1; i >= 0; i--) {
            if (T.charAt(i) == '#')
                TB++;
            else {
                if (TB > 0)
                    TB--;
                else
                    t.add(T.charAt(i));
            }
        }
        return s.equals(t);

    }
}
