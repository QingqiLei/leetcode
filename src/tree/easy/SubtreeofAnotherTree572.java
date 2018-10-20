package tree.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 */
public class SubtreeofAnotherTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {

        Queue<TreeNode> stack = new LinkedList<>();
        stack.offer(s);
        while (!stack.isEmpty()) {

            int size = stack.size();
            for (int i = 0; i < size; i++) {
                if (stack.peek().val == t.val && isSame(stack.peek(), t)) return true;
                if (stack.peek().left != null) stack.offer(stack.peek().left);
                if (stack.peek().right != null) stack.offer(stack.peek().right);
                stack.poll();
            }
        }
        return false;
    }

    boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;

        if (s.val == t.val) return isSame(s.left, t.left) && isSame(s.right, t.right);
        else return false;

    }

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n0 = new TreeNode(0);
        TreeNode n44 = new TreeNode(4);
        TreeNode n11 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);

        n1.left = n2;
        n1.right = n3;

        n11.left = n22;
        SubtreeofAnotherTree572 tool = new SubtreeofAnotherTree572();
        System.out.println(tool.isSubtree(n1, n11));


    }


}
