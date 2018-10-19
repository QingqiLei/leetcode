package tree.easy;

/**
 * Given a binary tree, return the tilt of the whole tree.
 *
 * The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
 *
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 */
public class BinaryTreeTilt563 {
    int result;
    public int findTilt(TreeNode root){
        help(root);
        return result;

    }

    int help(TreeNode root){

        if(root == null) return 0;
        int left = findTilt(root.left);
        int right = findTilt(root.right);
        result = result + Math.abs(left - right);
        return Math.abs(left - right);

    }
}
