package Math.medium;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsII462 {
    public int minMoves21(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j) {
            count += nums[j] - nums[i];
            i++;
            j--;

        }
        return count;
    }

    public int minMoves2(int[] A) {
        int sum = 0,
    }

    private int quickselect(int[] A, int k, int start, int end) {
        int l = start, r = end,
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
