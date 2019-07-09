package array.monotone;

import java.util.*;

// 每次遇到比栈中最后一个小，那么就排除最后一个。因为前面已经计算过了，
public class ShortestSubarraywithSumatLeastK862 {
    public int shortestSubarray(int[] A, int K) {
        Deque<Integer> d = new ArrayDeque<>();
        int[] preSum = new int[A.length+1];
        for(int i = 0; i < A.length; i++) preSum[i+1] = preSum[i] + A[i];
        int res = A.length + 1;
        for(int i = 0; i < preSum.length; i++){
            while (!d.isEmpty() && preSum[i] <= preSum[d.getLast()]) d.pollLast() ;
            while(!d.isEmpty() && preSum[i] - preSum[d.getFirst()] >= K)
                res = Math.min(res, i - d.pollFirst()) ;
            d.addLast(i);
        }
        return res == (A.length+1)?-1:res;
    }
}
