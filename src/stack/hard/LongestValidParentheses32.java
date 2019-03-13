package stack.hard;

import java.util.LinkedList;

public class LongestValidParentheses32 {
    public static int longestValidParentheses(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() != 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else stack.push(i);
        }
        return result;
    }

    public static int longestValidParentheses2(String s) {
        int[] dp = new int[s.length()];
        int result = 0;
        int leftCount = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') leftCount++;
            else if (leftCount > 0) {
                dp[i] = dp[i - 1] + 2;
                dp[i] += (i - dp[i]) > 0 ? dp[i - dp[i]] : 0;
                result = Math.max(result, dp[i]);
                leftCount--;
            }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses2("()(())"));
    }
}
