package IntString.easy;

/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
public class ReverseWordsInaStringIII557 {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length; i++)
            result.append(new StringBuffer(temp[i]).reverse().toString() + " ");
        return result.toString().trim();
    }
}
