package array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * <p>
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * <p>
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */
public class FindPivotIndex724 {

    public static int pivotIndex(int[] nums) {

        int right = 0, left = 0;
        for (int i = 0; i < nums.length; i++) right += nums[i]; //right == add up all numbers


        for (int i = 0; i < nums.length; i++) {
            if (i != 0) left += nums[i - 1]; // left : add from left
            right = right - nums[i];
            if (left == right) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
        List<Integer> list = new ArrayList<>(5);


    }
}