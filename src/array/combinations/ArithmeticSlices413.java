package array.combinations;
/*
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 */
public class ArithmeticSlices413 {
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0, curr = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i - 2] - A[i - 1] == A[i - 1] - A[i]) {
                curr++;
                res += curr;
            } else
                curr = 0;

        }
        return res;

    }

    public int numberOfArithmeticSlices1(int[] A) {
        int res = 0, curr = 2;
        for (int i = 2; i < A.length; i++)
            if (A[i - 2] - A[i - 1] == A[i - 1] - A[i]) {
                curr++;
            } else {
                if (curr > 2)
                    res += (curr - 1) * (curr - 2) / 2;
                curr = 2;
            }

        if (curr > 2)
            res += (curr - 1) * (curr - 2) / 2;
        return res;
    }
}
