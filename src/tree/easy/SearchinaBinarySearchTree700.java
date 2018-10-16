package tree.easy;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SearchinaBinarySearchTree700 {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root.val == val) return root;

        if (root.val < val && root.right != null)
            return searchBST(root.right, val);
        else if (root.val > val && root.left != null)
            return searchBST(root.left, val);

        return null;
    }

}
