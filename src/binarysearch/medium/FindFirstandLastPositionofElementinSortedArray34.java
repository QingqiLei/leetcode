package binarysearch.medium;
// find the higher_bound
public class FindFirstandLastPositionofElementinSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int left = helper1(nums, target);
        if(left == nums.length || nums[left] != target  ) return new int[]{-1,-1};
        return new int[]{left, helper1(nums,target +1 )-1};
    }

    // helper == helper1
    private int helper(int[] nums, int target){
        int left = 0, right = nums.length ;
        while(left < right){    // not equal maybe better,
            int mid = left + ((right - left) >>1);

            if(nums[mid] >=target) right = mid ;
            else left =mid +1;
        }
        return left;
    }
    /*
    pattern:
    length
    left < right
    if target is in the left part(<=nums[mid]) right = mid // the <= is the key
    if target is in the right part( > nums[mid]) left = mid +1
     */



    /*
     3 4 6
    somehow, mid points to 4, or 6
    4: left points to 6, and right finally points to 6
    6: right points to 6, left finally points to 6
    ......
    Only nums[mid] < target, let left = mid, so let right points the first target, then left+1 == right
     */

    private int helper1(int[] nums, int target){  // right left, the last: right == left == mid, the last last:
        int left = 0, right = nums.length-1 ;
        while(left <= right){    //
            int mid = left + ((right - left) >>1);
            if(nums[mid] >=target) right = mid -1; // if left and right can be equal, mid -1 is needed
            else left =mid +1;
        }
        return left; // when nums[mid] == target, right still needs to minus 1
    }


    /*
    ！！！！！！！！！！！！！！！！！！！！！！
    length-1       <=          mid -1
    length         <           mid
    ！！！！！！！！！！！！！！！！！！！！！！
     */

    public static void main(String[] args){
        FindFirstandLastPositionofElementinSortedArray34 t = new FindFirstandLastPositionofElementinSortedArray34();
        int r = t.helper(new int[]{1,4,4,6,8,9},5);
        System.out.println(r);
    }
}
