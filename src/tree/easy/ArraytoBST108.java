package tree.easy;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class ArraytoBST108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.right = sortedArrayToBST(nums, mid + 1, high);
        node.left = sortedArrayToBST(nums, low, mid - 1);
        return node;
    }
}
