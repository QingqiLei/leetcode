package tree.easy;

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * what we want from left and left is that the max Depth, not the diameter of left and right
 */
public class DiameterofBinaryTree543 {
    int result;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return result;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        result = Math.max(result, left + right);
        return Math.max(right, left) + 1;
    }
}
