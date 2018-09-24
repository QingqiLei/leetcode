package tree.easy;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII437 {
    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return helper(root, 0, sum, map);

    }

    private int helper(TreeNode root, int currSum, int target, Map<Integer, Integer> preSum) {

        currSum = currSum+root.val;

        int res = preSum.getOrDefault(currSum -target,0);
        preSum.put(currSum,preSum.getOrDefault(currSum,0)+1);
        res += helper(root.left, currSum,target, preSum)+helper(root.right,currSum,target,preSum);
        preSum.put(currSum,preSum.get(currSum)-1);
        return res;
    }
}
