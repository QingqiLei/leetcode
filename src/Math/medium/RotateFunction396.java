package Math.medium;

public class RotateFunction396 {
    public int maxRotateFunction(int[] A) {
        if (A.length == 0) return 0;
        int sum = 0, iteration = 0, len = A.length;
        for (int i = 0; i < len; i++) {
            sum += A[i];
            iteration += A[i] * i;

        }
        int max = iteration;
        for (int i = 1; i < len; i++) {
            iteration = iteration - sum + A[i - 1] * len;
            max = Math.max(max, iteration);
        }
        return max;
    }

}
