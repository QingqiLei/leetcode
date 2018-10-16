package tree.easy;

public class MaximumDepthofNaryTree559 {
    int max;

    public int maxDepth(Node root) {

        if (root == null) return 0;
        maxDepth(root, 1);
        return max;
    }

    void maxDepth(Node root, int Depth) {

        if (root == null) return;
        max = Math.max(max, Depth);

        for (Node node : root.children)
            maxDepth(node, Depth + 1); // DFS
    }
}


