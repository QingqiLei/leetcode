package tree.easy;

import java.util.*;

/**
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
 */
public class FindModeinBinarySearchTree501 {
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        while (!queue.isEmpty()) {
            map.put(queue.peek().val, map.getOrDefault(queue.peek().val, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(queue.peek().val));
            if (queue.peek().left != null) queue.offer(queue.peek().left);
            if (queue.peek().right != null) queue.offer(queue.peek().right);
            queue.poll();
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        List<Integer> list = new ArrayList<>();
        for (Map.Entry e : entrySet)
            if ((Integer) e.getValue() == maxFrequency) list.add((int) e.getKey());

        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) array[i] = list.get(i);
        return array;
    }
}
