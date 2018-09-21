package array.easy;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 */
public class TwoSumIIInputarrayissorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (end > start) {
            if (numbers[start] + numbers[end] < target)
                start++;
            else if (numbers[start] + numbers[end] > target)
                end--;
            else return new int[]{start + 1, end + 1};
        }
        return new int[]{};


    }
}
