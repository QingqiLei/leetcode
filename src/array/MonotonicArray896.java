package array;

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 */
public class MonotonicArray896 {
    public boolean isMonotanic(int[] A) {
        boolean smaller = false;

        for (int i = 0, count = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) continue;
            if (++count >= 2 && smaller != (A[i] < A[i + 1])) return false;
            smaller = (A[i]<A[i+1]);
        }
        return true;
    }
}
