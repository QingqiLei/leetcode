package IntString.medium;

// up and down sequence
public class WiggleSubsequence376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 0) return 0;
        int[] up  = new int[nums.length];
        int[] down  = new int[nums.length];
        up[0] = 1;
        down[0] = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){

                up[i] = down[i-1] + 1;
                down[i] = down[i-1];
                System.out.println(up[i] +" "+i);
            }
            else if(nums[i] < nums[i-1]){
                down[i] = up[i-1] +1;
                up[i] = up[i-1];
                System.out.println(down[i] + " "+ i);
            }else {
                up[i] = up[i-1];
                down[i] = down[i-1];
            }
        }
        return Math.max(up[nums.length-1], down[nums.length-1]);
    }
}
