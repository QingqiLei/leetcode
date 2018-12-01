package array.sumorproduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length -3 ;i++){
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break; //first candidate too large, search finished
            if(nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)continue;
            if(i > 0 || nums[i] == nums[i-1]) continue;
                for(int j = i+1; j < nums.length-2; j++) {
                    if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)break; //second candidate too large
                    if(nums[i]+nums[j]+nums[nums.length-1]+nums[nums.length-2]<target)continue; //second candidate too small

                    if (j > i + 1 || nums[j] == nums[j - 1]) continue;
                        int left = j + 1, right = nums.length - 1;

                        while(left < right){
                            int sum = nums[i] + nums[j] + nums[left]+nums[right];
                            if(target == sum) {
                                ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                left ++;
                                right --;
                                while(left < right && nums[left] == nums[left -1]) left++;
                                while(left < right && nums[right] == nums[right +1]) right --;

                            }else if( target < sum) right--;
                            else left++;
                        }



            }
        }
        return ans;
    }
}
