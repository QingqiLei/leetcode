package binarysearch;

public class FirstEqualGreater {
    public static int firstEqualGreater(int[] A, int target){
        int left = 0, right = A.length-1;
        while(left < right){
            int mid = left + ( right - left)/2;
            if(A[mid] < target) left = mid+1;
            else right = mid;
        }
        return left;
    }
}
