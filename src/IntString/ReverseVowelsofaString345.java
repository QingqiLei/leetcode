package IntString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 */
public class ReverseVowelsofaString345 {
    public static String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));

        char[] list = s.toCharArray();
        for (int i = 0, j = list.length - 1; i < j; ) {
            if (!set.contains(list[i])) {
                i++;
                continue;
            }
            if (!set.contains(list[j])) {
                j--;
                continue;
            }

            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
