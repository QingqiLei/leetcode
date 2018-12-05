package array.monotone;

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
        for(int i = 1; i< A.length; i++){
            int left = i-1;
            while(left >=0 && A[left] > A[i])          // ! one of there must contain =
                left = p[left];
            p[i] = left;
        }

        n[A.length-1] = A.length;
        for(int i = A.length-2; i>=0;i--){
            int right = i+1;
            while(right < A.length && A[i] <= A[right]) // !
                right = n[right];
            n[i] = right;
        }

        int res = 0;
        int modulo = (int)Math.pow(10, 9)+7;
        for(int i = 0; i < A.length; i++){
            res += A[i] * (i - p[i]) * (n[i]-i);
            res %=modulo;
        }
        return res;
    }
}
