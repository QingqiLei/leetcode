package array;

public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[n++] = n;
        return i;
    }
}
