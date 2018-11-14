package array.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), k,1,n);
                return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> comb, int k, int start, int n){
        if(comb.size() == k && n == 0){
            ans.add(new ArrayList<>(comb));
            return;

        }

        for(int i = start; i < 10; i++){
            comb.add(i);
            helper(ans,comb,k,i+1,n-1);
            comb.remove(comb.size() -1);
        }
    }
}
