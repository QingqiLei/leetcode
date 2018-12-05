package array.monotone;

import java.util.Stack;

public class SumofSubarrayMinimums907 {
    /*
    [2, 9, 7, 8, 3, 4, 6, 1]

    NLE [7, 2, 4, 4, 7, 7, 7, 8]    右边第一个比当前大的数字距离当前的距离
    PLE [-1, 0, 0, 2, 0, 4, 5, -1]  左边第一个比当前小的数字距离当前的距离
     */

    public int sumSubarrayMins(int[] A) {
        int[] n = new int[A.length];
        int[] p = new int[A.length];

        p[0] = -1;
        for (int i = 1; i < A.length; i++) {
            int left = i - 1;
            while (left >= 0 && A[left] > A[i])          // ! one of there must contain =
                left = p[left];
            p[i] = left;
        }

        n[A.length - 1] = A.length;
        for (int i = A.length - 2; i >= 0; i--) {
            int right = i + 1;
            while (right < A.length && A[i] <= A[right]) // !
                right = n[right];
            n[i] = right;
        }

        int res = 0;
        int modulo = (int) 1e9 + 7;
        for (int i = 0; i < A.length; i++) {
            res += A[i] * (i - p[i]) * (n[i] - i);
            res %= modulo;
        }
        return res;
    }

    public int sumSubarrayMins1(int[] A) {
        int res = 0, mod = (int) 1e9 + 7;
        int[] left = new int[A.length], right = new int[A.length];
        Stack<int[]> s1 = new Stack<>(), s2 = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int count = 1;
            while (!s1.isEmpty() && s1.peek()[0] > A[i])
                count += s1.pop()[1];
            s1.push(new int[]{A[i], count});
            left[i] = count;
        }

        for (int i = A.length - 1; i >= 0; i--) {
            int count = 1;
            while (!s2.isEmpty() && s2.peek()[0] >= A[i])
                count += s2.pop()[1];
            s2.push(new int[]{A[i], count});
            right[i] = count;
        }

        for (int i = 0; i < A.length; i++)
            res = (res + A[i] * left[i] * right[i]) % mod;
        return res;

    }
}
