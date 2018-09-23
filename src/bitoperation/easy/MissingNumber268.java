package bitoperation.easy;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
}
// 下表相对于数组的值，多了一个数组的值缺少的，少了 nums.length