package SystemDesign;

import tree.TreeNode;

import java.util.Stack;

public class BinarySearchTreeIterator173 {
    Stack<TreeNode> stack ;
    public BinarySearchTreeIterator173(TreeNode root) {
        stack  = new Stack<>();
        pushAllLeft(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        pushAllLeft(node.right);
        return node.val;
    }


    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushAllLeft(TreeNode node){
        for(; node != null ; stack.push(node), node = node.left);
    }


}
