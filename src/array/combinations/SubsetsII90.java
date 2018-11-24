package array.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(list, nums, new ArrayList<>(), 0);
        return list;
    }

    private void helper(List<List<Integer>> result, int[] nums, List<Integer> curr ,int index){
        result.add(new ArrayList<>(curr));
        for(int i = index; i < nums.length; i ++){
            if(i > index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            helper(result,nums ,curr ,i+1 );
            curr.remove(curr.size()-1);
        }
    }
}
