package greedy.medium;
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
 */
public class JumpGame55 {
    // Looking from the start and selecting the locally optimum in the hope of reaching global optimum
    public boolean canJump1(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (i > max) return false;
            max = Math.max(A[i] + i, max);
        }
        return true;
    }
// DP: Looking from the end and at each point ahead checking the best possible way to reach the end
    public static  boolean canJump(int[] A) {
        int n = A.length;
        boolean[] used = new boolean[n];
        used[n - 1] = true;
        for (int i = n - 2; i >= 0; i--)
            for (int j = 0; j <= A[i] && i + j < n; j++) {
                if (used[i + j] == true) {
                    used[i] = true;
                    break;
                }
            }
        return used[0];
    }
    public static void main(String[] args){
        boolean b = canJump(new int[]{2,3,1,0,4});


    }

}
