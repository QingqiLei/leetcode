package tree.easy;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;

        if (left.val != right.val) return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
