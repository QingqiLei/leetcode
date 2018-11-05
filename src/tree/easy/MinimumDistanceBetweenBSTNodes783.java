package tree.easy;

import java.util.TreeSet;

public class MinimumDistanceBetweenBSTNodes783 {
    TreeSet<Integer> set = new TreeSet<>();
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root == null) return min;
        if(! set.isEmpty()){
            if(set.floor(root.val) != null)
                min = Math.min(min,root.val - set.floor(root.val));
            if(set.ceiling(root.val) != null)
                min = Math.min(min, set.ceiling(root.val) - root.val);
        }
        set.add(root.val);
        minDiffInBST(root.left);
        minDiffInBST(root.right);
        return min;
    }

}
