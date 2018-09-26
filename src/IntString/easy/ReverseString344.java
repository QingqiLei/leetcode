package IntString.easy;

/**
 * Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseString344 {
    public String reverseString(String s){
        char[] result = s.toCharArray();
        for(int i = result.length -1, j = 0; j < result.length; j++,i--)
            result[j] =s.charAt(i);
        return new String(result);
    }
}
