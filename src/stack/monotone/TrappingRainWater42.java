package stack.monotone;

import java.util.Stack;

public class TrappingRainWater42 {
    public int trap1(int[] h) {
        int left = 0, right = h.length - 1, leftMax = 0, rightMax = 0, res = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, h[left]);
            rightMax = Math.max(rightMax, h[right]);
            if (leftMax < rightMax) {
                res += leftMax - h[left];
                left++;
            } else {
                res += rightMax - h[right];
                right--;
            }
        }
        return res;
    }

    public int trap(int[] A){
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for(int i = 0; i < A.length;i++ ){
            while(!s.isEmpty() && A[i] > A[s.peek()]){
                int bar = A[s.pop()];
                res += s.isEmpty()?0:(i-s.peek()-1) *(Math.min(A[i],A[s.peek()]) - bar);
            }
            s.push(i);
        }
        return res;
    }
}
