package tree.medium;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/*
The the basic idea is to take the last element in postorder array as the root, find the position of the root in the inorder array; then locate the range for left sub-tree and right sub-tree and do recursion. Use a HashMap to record the index of root in the inorder array.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal106 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTreePostIn(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length;i++)
            map.put(inorder[i],i );
        return helper(0, inorder.length-1, postorder,postorder.length-1);
    }


    private TreeNode helper( int inStart, int inEnd, int[] postorder, int postEnd){
        if(inStart > inEnd || postEnd < 0) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int inIndex = map.get(postorder[postEnd]);

        root.left = helper(inStart,inIndex-1 ,postorder ,postEnd - inEnd + inIndex -1 );
        root.right = helper(inIndex +1, inEnd, postorder, postEnd - 1);
        return root;

    }
}
