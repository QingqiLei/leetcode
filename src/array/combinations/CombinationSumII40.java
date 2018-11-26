package array.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates ,ans ,new ArrayList<Integer>() ,target,0 );
        return ans;
    }
    private void helper(int[] cand , List<List<Integer>> ans, List<Integer> comb, int target, int start){
        if(target < 0) return ;
        else if(target == 0) ans.add(new ArrayList<>(comb));
        else
            for(int i = start; i < cand.length; i++){
                if(i > start && cand[i] == cand[i-1]) continue;
                comb.add(cand[i]);
                helper(cand, ans, comb, target - cand[i],i+1 );
                comb.remove(comb.size()-1);
            }
    }
}
