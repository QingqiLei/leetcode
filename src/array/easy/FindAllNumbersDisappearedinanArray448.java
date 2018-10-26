package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * n number and m pairs, find the missing number,
 * from 1 to n, the length is n, too
 */
public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisapperaedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) result.add(i + 1);

        }
        return result;
    }
}

