package tree.easy;

/**
 *  find the the depth of a tree,  for a root, the return 1+  Math.max(left depth, right depth)
 *  so this is a easy solution
 */
public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
