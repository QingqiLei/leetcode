package binarysearch.medium;

public class FindFirstandLastPositionofElementinSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int left = helper(nums, target);
        if(nums[left] != target || left == nums.length) return new int[]{-1,-1};
        return new int[]{left, helper(nums,target +1 )};
    }

    private int helper(int[] nums, int target){
        int left = 0, right = nums.length -1;
        while(left < right){    // not equal maybe better, cause when nums.length == 0, nums[0] is wrong.
            int mid = left + ((right - left) >>1);
            if(nums[mid] >=target) right = mid ;
            else left =mid +1;                 // at last, left = right +1
        }
        return left;
    }

    public static void main(String[] args){
        FindFirstandLastPositionofElementinSortedArray34 t = new FindFirstandLastPositionofElementinSortedArray34();
        int r = t.helper(new int[]{1,4,4,6,7,8,9},4);
        System.out.println(r);
    }
}
