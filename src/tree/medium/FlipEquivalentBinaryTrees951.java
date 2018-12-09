package tree.medium;

import tree.TreeNode;

/*
 *For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.

A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.

Write a function that determines whether two binary trees are flip equivalent.  The trees are given by root nodes root1 and root2.
 */
public class FlipEquivalentBinaryTrees951 {
    public boolean flipEquiv(TreeNode r, TreeNode t) {
        if(r == null || t == null) return r == t;
        if(r.val != r.val) return false;  // !!!!!!
        return (flipEquiv(r.left,t.left)&&  flipEquiv(r.right, t.right)) ||
                (flipEquiv(r.left,t.right) && flipEquiv(r.right, t.left));
    }
}
