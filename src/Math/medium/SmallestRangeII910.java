package Math.medium;

import java.util.Arrays;

public class SmallestRangeII910 {
    /*
    for each A[i], we may choose either x = 0 or x = 2 * k.
    add x = 0 to all A[i],  res = A[n -1] - A[0]
    starting from the smallest of A, we add 2*k to A[i],
    update the new mx = max(mx, A[i] + 2*k)
    update the new mn = min(A[i+1], A[0] + 2*k)
    update res = min(res, mx - mn)

     */
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length, mx = A[n - 1], mn = A[0], res = mx - mn;
        for (int i = 0; i < n - 1; ++i) {
            mx = Math.max(mx, A[i] + 2 * K);
            mn = Math.min(A[i + 1], A[0] + 2 * K);
            res = Math.min(res, mx - mn);
        }
        return res;
    }
}
