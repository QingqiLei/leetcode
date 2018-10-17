package tree.easy;

/**
 * trim a binary search tree
 */
public class TrimaBinarySearchTree669 {
    public TreeNode trimBST(TreeNode root, int L, int R){

        if(root.val < L)  return trimBST(root.right,L,R);
        if(root.val > R)  return trimBST(root.left,L,R);

        root.left = trimBST(root.left, R,L);
        root.right = trimBST(root.right, R,L);
        return root;
    }
}
