package array.medium;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length -1, index = 0;
        while(index <= p2){
            if(nums[index]  == 0){
                nums[index] = nums[p0];
                nums[p0] = 0;
                p0++;
            }
            else if(nums[index] ==2){
                nums[index] =nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }
}
