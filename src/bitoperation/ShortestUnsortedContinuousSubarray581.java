package bitoperation;

/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
 * <p>
 * You need to find the shortest such subarray and output its length.
 * <p>
 * unsorted order is that the front is bigger than the behind,
 * SolutionL: so, find the first element that is bigger than the behind
 * and find the last element that is smaller than the front
 */
public class ShortestUnsortedContinuousSubarray581 {
    public static int findUnsortedSubarray(int[] A) {
        int n = A.length, beg = -1, end = -2, min = A[n - 1], max = A[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n - 1 - i]);
            if (A[i] < max) end = i;
            if (A[n - 1 - i] > min) beg = n - 1 - i;
        }
        return end - beg + 1;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}
