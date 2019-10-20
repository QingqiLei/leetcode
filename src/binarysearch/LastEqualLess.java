package binarysearch;

public class LastEqualLess {
    public static int lastEqualLess(int[] A, int target){
        int left = 0, right = A.length-1;
        while(left < right){
            int mid = left + ( right - left +1)/2;
            if(A[mid] > target) right = mid -1;
            else left = mid;
        }
        return left;
    }
}
