package tree.medium;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal105 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for( int i = 0; i < inorder.length; i++)
            map.put(inorder[i],i );
        return helper(0, 0, inorder.length-1, preorder);
    }
    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder){
        if(preStart > preorder.length -1|| inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = map.get(preorder[preStart]);
        root.left = helper(preStart+1,inStart ,inIndex-1 , preorder);
        root.right = helper(preStart + inIndex - inStart +1, inIndex+1,inEnd , preorder);
        return root;
    }
}
