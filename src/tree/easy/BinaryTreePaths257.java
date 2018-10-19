package tree.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * from root to leaves : path
 */
public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) binaryTreePaths(root, "", answer);
        return answer;
    }

    private void binaryTreePaths(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) answer.add(path + root.val);

        if (root.left != null) binaryTreePaths(root.left, path + root.val + "->", answer);

        if (root.right != null) binaryTreePaths(root.right, path + root.val + "->", answer);

    }
}
