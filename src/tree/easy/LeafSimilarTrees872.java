package tree.easy;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {
    private List<Integer> list1 = new ArrayList();
    private List<Integer> list2 = new ArrayList();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafSimilar(root1, list1);
        leafSimilar(root2, list2);

        return list1.equals(list2);

    }

    void leafSimilar(TreeNode root, List<Integer> list) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        leafSimilar(root.left, list);
        leafSimilar(root.right, list);

    }

}
