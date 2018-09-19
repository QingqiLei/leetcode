package array;

import java.util.List;
import java.util.stream.Stream;

public class MaxConsecutiveOnes485 {
    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=1){
                max = Math.max(count,max);
                count = 0;
            }
            if(nums[i]==1)
                count++;
        }
        return Math.max(count,max);
    }

    public static void main(String[] args){
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}