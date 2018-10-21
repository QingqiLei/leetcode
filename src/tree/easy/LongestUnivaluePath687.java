package tree.easy;

/**
 * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
 */
public class LongestUnivaluePath687 {
    int len;

    public int longestUnivaluePath(TreeNode root) {
        if (root != null) longestUnivaluePath(root, -1);
        return len;
    }

    int longestUnivaluePath(TreeNode curr, int val) {
        if (curr == null) return 0;

        int left = longestUnivaluePath(curr.left, curr.val), right = longestUnivaluePath(curr.right, curr.val);

        len = Math.max(len, left + right);
        // left is "valid" connecting edges to me from left,

        if (curr.val == val)
            return Math.max(len, right) + 1; // give it to caller max path with same number, include me;
        return 0; // caller.val  != my val

    }
}
