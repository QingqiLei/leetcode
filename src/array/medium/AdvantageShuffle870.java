package array.medium;

import java.util.Arrays;

public class AdvantageShuffle870 {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int[] ans = new int[A.length];
        boolean [] used = new boolean[A.length];
        for(int i = 0; i < A.length; i++){
            int b = B[i];
            int indexInA = find(A,used ,b );
            used[indexInA] = true;
            ans[i] = A[indexInA];
        }

        return ans;

    }

    private int find(int[] A, boolean[] used, int b) {
        int ind = Arrays.binarySearch(A, b);
        if(ind < 0)
            ind = -(ind +1);
        else ind ++;

        while( ind < A.length){
            if(!used[ind] && A[ind] > b)
                return ind;
            ind++;
        }
        for(int i = 0; i < A.length ; i++)
            if(!used[i]) return i;

        return -1;
    }
}