package array.medium;

import java.util.Arrays;

public class ValidTriangleNumber611 {
    public int triangleNumber(int[] A) {
        Arrays.sort( A);
        int count = 0;
        for(int i = A.length-1; i >= 2; i--){
            int left = 0, right = i -1;
            while(left <= right){
                if(A[left] + A[right] >A[i]) {
                    count +=(right - left);
                    right --;
                }else left ++;
            }
        }
        return count;
    }
}
