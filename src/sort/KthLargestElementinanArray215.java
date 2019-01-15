package sort;

import java.util.Random;

public class KthLargestElementinanArray215 {
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        k = nums.length - k;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int j = partition(nums, left, right);
            if (j > k) right = j - 1;
            else if (j < k) left = j + 1;
            else break;
        }
        return nums[k];
    }

    private int partition(int[] a, int left, int right) {
        int i = left, j = right + 1;
        while (true) {
            while (i < right && a[++i] < a[left]) ;
            while (j > left && a[left] < a[--j]) ;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, left, j);
        return j;
    }

    private void shuffle(int a[]) {
        Random random = new Random();
        for (int i = 1; i < a.length; i++)
            exch(a, i, random.nextInt(1 + i));
    }

    private void exch(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

    }

}
