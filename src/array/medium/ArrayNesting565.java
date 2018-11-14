package array.medium;

public class ArrayNesting565 {
    public int arrayNesting(int[] nums) {
        int maxSize = 0;
        for(int i = 0; i < nums.length; i++){
            int size = 0;
            for(int k = i;  nums[k]>=0;size++ ){
                int ak = nums[k];
                nums[k] = -1;
                k = ak;
            }
            maxSize = Math.max(maxSize, size);
        }
        return maxSize;
    }
}
