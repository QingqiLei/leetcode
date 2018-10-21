package tree.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.
 */
public class MinimumDepthofBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                if (queue.peek().left == null && queue.peek().right == null) return depth; // return the first found leaf
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                queue.poll();

            }
            depth++;
        }
        return 0;
    }
}
