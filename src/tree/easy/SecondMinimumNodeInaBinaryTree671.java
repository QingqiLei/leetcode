package tree.easy;

/**
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
 * <p>
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 * <p>
 * If no such second minimum value exists, output -1 instead.
 * <p>
 * <p>
 * <p>
 * means that every root is the minimum in its tree!
 */
public class SecondMinimumNodeInaBinaryTree671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null | root.left == null) return -1;

        int left = root.left.val;
        int right = root.right.val;

        if (left == root.val)
            left = findSecondMinimumValue(root.left);

        if (right == root.val)
            right = findSecondMinimumValue(root.right);

        if (left != -1 && right != -1)
            return Math.min(left, right);
        else if (left != -1)
            return left;
        else return right;
    }
}


