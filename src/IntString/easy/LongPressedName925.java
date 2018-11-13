package IntString.easy;

/**
 * Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
 *
 * You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 *
 * name = "leelee", typed = "lleeelee"  : true
 */
public class LongPressedName925 {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, m = name.length(), n = typed.length();
        for (int j = 0; j < n; ++j) // name
            if (i < m && name.charAt(i) == typed.charAt(j)) // let i++ when chars are equal
                ++i;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) // if somewhere
                return false;
        return i == m;
    }
}