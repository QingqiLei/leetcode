package stack.monotone;

import java.util.*;

// 单调栈， 只需找出一个元素，左右两边第一个小于当前元素的index，那么左边和右边之间，当前元素最低。
// 单调栈，可以有两个方法来计算，1. 数组中当前最大， 栈顶元素就是数组中最大的。 2.就是本题中的单调栈，栈是变化的，栈顶元素就是当前元素，
// 栈中前面的元素也是按顺序的，一个特点就是当前栈顶元素和下一个元素之间的元素都大于栈顶元素。
public class LargestRectangleinHistogram84 {
    public int largestRectangleArea(int[] h) {
        int res = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= h.length; i++) {
            int height = i == h.length ? 0 : h[i];
            while (!s.isEmpty() && height < h[s.peek()]) // 如果找到小于栈顶的元素。那么栈顶元素就是栈中当前最大的。
                res = Math.max(res, h[s.pop()] * (s.isEmpty() ? i : i - 1 - s.peek()));
            s.push(i);
        }
        return res;
    }

        public int largestRectangleArea1(int[] h){
        int n = h.length;
        int[] left = new int[n];
        for(int i = 0; i <n; i++){

        }
return 1;
    }




}
