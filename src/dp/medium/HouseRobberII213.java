package dp.medium;

public class HouseRobberII213 {
    public int rob(int[] nums){
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums,0,nums.length-2), rob(nums,1,nums.length-1));
    }
    public int rob(int[] nums, int start, int end){
        int include = 0, exclude = 0;
        for(int i = start; i <= end; i ++){
            int in = include, ex = exclude;
            include = ex + nums[i];
            exclude = Math.max(in, ex);
        }
        return Math.max(exclude, include);
    }
}
