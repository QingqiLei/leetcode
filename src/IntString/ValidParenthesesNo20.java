package IntString;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParenthesesNo20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != s.charAt(i))
                        return false;

            }
        }
        return stack.isEmpty();
    }
}
