package array.medium;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 */
public class ProductofArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] =1;
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        int rightProduct  = 1;
        for(int i = ans.length-1; i>=0;i--){
            ans[i] = ans[i] *rightProduct;
            rightProduct *=nums[i];
        }
        return ans;
    }
}
