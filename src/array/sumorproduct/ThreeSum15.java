package array.sumorproduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++)
            if (i == 0 || nums[i] != nums[i - 1]) { // make sure just use one number once
                int left = i + 1, right = nums.length - 1, sum = 0 - nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;   // make sure just use one number once
                        while (left < right && nums[right] == nums[right - 1]) right--;// make sure just use one number once
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > sum)
                        right--;
                    else left++;

                }
            }


        return list;
    }

}
