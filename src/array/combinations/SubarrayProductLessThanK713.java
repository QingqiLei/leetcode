package array.combinations;

public class SubarrayProductLessThanK713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, product = 1;
        for(int i = 0, j = 0; j < nums.length ; j++){
            product *= nums[j];
            while(i <=j && product >= k)
                product /=nums[i++];
            count += j-i+1; // how many combination increased after one element was added to  i elements?      i+1
        }
        return count;
    }
}
