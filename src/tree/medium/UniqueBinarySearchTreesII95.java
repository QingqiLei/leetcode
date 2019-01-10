package tree.medium;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTreesII95 {
    // this time complexity is very big, O(4^n/n^(1/2))
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<TreeNode>();
        return getTrees(1, n);
    }

    private List<TreeNode> getTrees(int start, int end) {
        List<TreeNode> res = new LinkedList();
        if (start > end) {
            res.add(null);
            return res;

        }

//        if (start == end) {
//            res.add(new TreeNode(start));
//            return res;
//        }

        List<TreeNode> left, right;
        for (int i = start; i <= end; i++) {
            left = getTrees(start, i - 1);
            right = getTrees(i + 1, end);
            for (TreeNode leftNode : left)
                for (TreeNode rightNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }

        }
        return res;
    }
}
