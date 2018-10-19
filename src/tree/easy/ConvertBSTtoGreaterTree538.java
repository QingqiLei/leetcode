package tree.easy;

/**
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
 */
public class ConvertBSTtoGreaterTree538 {
    int sum;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        root.val = root.val + sum;
        sum = root.val;
        convertBST(root.left);
        return root;
    }


}
