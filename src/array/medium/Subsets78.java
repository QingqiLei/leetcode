package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets78 {
     public List<List<Integer>> subsets2(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         ans.add(new ArrayList<>());
         for(int num: nums) {
             List<List<Integer>> tmp = new ArrayList<>();
             for (List<Integer> i : ans) {
                 List<Integer> a = new ArrayList<>();
                 a.add(num);
                 tmp.add(a);
             }
             ans.addAll(tmp);
         }
         return ans;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums,0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans , List<Integer> tempList, int [] nums, int start){
        ans.add(new ArrayList<>(tempList));
        for(int i = start; i< nums.length ; i++){
            tempList.add(nums[i]);
            backtrack(ans,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }

    }
}
