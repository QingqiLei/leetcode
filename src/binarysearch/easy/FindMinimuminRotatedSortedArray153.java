package binarysearch.easy;

public class FindMinimuminRotatedSortedArray153 {
    public int findMin(int[] num) {
        int left = 0;
        int right = num.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(num[right] < num[mid])
                left = mid +1;
            else right = mid;
        }
        return num[right];
    }
}