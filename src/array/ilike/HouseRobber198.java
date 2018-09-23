package array.ilike;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 */
public class HouseRobber198 {
    public static int rob(int[] nums) {
        int includePre = 0;
        int excludePre = 0;
        // loop variants holds
        for (int i = 0; i < nums.length; i++) {
            int temp = includePre;
            includePre = excludePre + nums[i];
            excludePre = Math.max(temp, excludePre);

        }
        return Math.max(includePre, excludePre);
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 20, 9, 3, 1}));
    }
}
