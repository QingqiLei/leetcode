package dp.medium;

public class MinimumSwapsToMakeSequencesIncreasing801 {
    // O(N) time, O(1) space
    public int minSwap(int[] A, int[] B) {
        int wrapnum = 1, skipnum = 0;
        for(int i = 1; i < A.length; i++)
            if (A[i -1] >= B[i] || B[i-1] >= A[i])
                // In this case, the ith manipulation should be same as the i-1th manipulation
                wrapnum ++;
            else if(A[i -1] >= A[i] || B[i-1] >= B[i]){
                // In this case, the ith manipulation should be the opposite of  the i-1th manipulation
                int temp = wrapnum;
                wrapnum = skipnum +1;
                skipnum = wrapnum;

            }
            else {
                // Either swap or skip is ok, let's keep the minimum one.
                wrapnum = Math.min(wrapnum, skipnum) +1;
                skipnum = wrapnum -1;
            }
            return Math.min(wrapnum, skipnum);
    }

}
