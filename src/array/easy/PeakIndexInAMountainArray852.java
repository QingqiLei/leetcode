package array.easy;

public class PeakIndexInAMountainArray852 {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(A[mid]  < A[mid +1]) left  = mid +1;
            else if(A[mid -1] < A[mid]) right = mid -1;
            else return mid;
        }
        return -1;
    }

    public int peakIndexInMountainArray1(int[] A) {
        int left = 0, right = A.length -1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(A[mid]  < A[mid +1]) left  = mid +1;
            else right = mid;
        }
        return left;
    }


}
