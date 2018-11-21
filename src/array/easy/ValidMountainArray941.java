package array.easy;

public class ValidMountainArray941 {
    public boolean validMountainArray(int[] A) {
        int left = 0, right = A.length;
        while( left < A.length && A[left+1] > A[left]) left++;
        while(right > 0 && A[right -1] > A[right]) right --;
        return  (left < A.length-1) && (right > 0) && (left == right);
    }
}
