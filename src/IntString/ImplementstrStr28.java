package IntString;

/**
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 */
public class ImplementstrStr28 {
    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();

        if (l1 < l2)
            return -1;
        else if (l2 == 0)
            return 0;

        int threshold = l1 - l2;

        for (int i = 0; i <= threshold; ++i)
            if (haystack.substring(i, i + l2).equals(needle))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaac", "aac"));

    }
}
