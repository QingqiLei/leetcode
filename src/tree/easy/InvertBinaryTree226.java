package tree.easy;

import java.util.Stack;

/**
 * Invert a binary tree.
 */
public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop(), left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null)
                stack.push(node);
            if (node.right != null)
                stack.push(node.right);
        }
        return root;
    }
}
