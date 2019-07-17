package stack.hard;

import java.util.LinkedList;

public class LongestValidParentheses32 {
    public static int longestValidParentheses(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == '(') stack.push(i);
           else {
               stack.pop();
               if(stack.isEmpty()) stack.push(i);
               else result = Math.max(result, i - stack.peek());
           }
        }
        return result;
    }






}
