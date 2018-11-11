package IntString.easy;

public class LargestNumberAtLeastTwiceofOthers747 {
    public int dominantIndex(int[] nums) {
        int first = -1, second = -1, index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]> first){
                second = first;
                first = nums[i];
                index = i;
            }else if(nums[i]> second){
                second = nums[i];

            }

        }
        return first >= second*2? index : -1;
    }
}
