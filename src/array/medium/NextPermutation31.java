package array.medium;

public class NextPermutation31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length-1;
        if(nums.length <=1 ) return;
        for(; i >0; i--)
            if(nums[i] > nums[i-1])
                break;
        if(i != 0)
            swap(nums, i-1);
        reverse(nums,i);

    }
    private void swap(int[] nums, int index){
        for(int i = nums.length-1 ; i>index; i--){
            if(nums[index] < nums[i]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
    }

    private void reverse(int[] nums, int index){
        int left = index, right = nums.length-1;
        for(; left< right; left ++, right --){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}
