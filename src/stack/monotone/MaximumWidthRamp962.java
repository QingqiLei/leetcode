package stack.monotone;

import java.util.Stack;
/*
Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].  The width of such a ramp is j - i.
 */
public class MaximumWidthRamp962 {
    public int maxWidthRamp(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < A.length; i++)
            if(stack.isEmpty() || A[stack.peek()]  > A[i])
                stack.push(i);
            int res = 0;
            for(int i = A.length-1; i>=0; i--)
                while (!stack.isEmpty() && A[stack.peek()] < A[i])
                    res =Math.max(res, i - stack.pop());
                return res;


    }
}

