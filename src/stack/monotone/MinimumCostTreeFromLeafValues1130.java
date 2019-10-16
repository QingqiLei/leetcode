package stack.monotone;

import java.util.Stack;

public class MinimumCostTreeFromLeafValues1130 {
    public int mctFromLeafValues(int[] arr) {
        int res = 0;
        Stack<Integer> q = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!q.isEmpty() && arr[i] >= q.peek())
                res += q.pop() * Math.min(arr[i], q.peek());
            q.push(arr[i]);
        }
        while (q.size() > 1) {
            res += q.pop() * q.peek();
        }
        return res;
    }
}
