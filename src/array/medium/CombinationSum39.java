package array.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0,target);
        return list;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> comb, int[] candidates, int start, int target) {
        if (target < 0) return;
        else if (target == 0) ans.add(new ArrayList<>(comb));
        else
            for (int i = start; i < candidates.length; i++) {
                comb.add(candidates[i]);
                backtrack(ans, comb, candidates, i,target - candidates[i]); // not i + 1 because we can reuse same elements
                comb.remove(comb.size() - 1);
            }
    }

    public static void main(String[] args) {
        CombinationSum39 t = new CombinationSum39();
        System.out.print(t.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
