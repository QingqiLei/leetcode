package array.medium;

public class MaximumLengthofRepeatedSubarray718 {
    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length, max = 0;
        int[] dp = new int[m+1];
        for(int i = 1; i <=n; i++)
            for(int j = m ; j >= 1 ; j --){
                if(A[i-1] == B[j-1]){
                    dp[j] = dp[j-1]+1;
                    max = Math.max(max,dp[j] );

                }else dp[j] = 0;
            }
            return max;

    }
    public static void main(String[] args){
        MaximumLengthofRepeatedSubarray718 t = new MaximumLengthofRepeatedSubarray718();
        System.out.print(t.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
    }
}