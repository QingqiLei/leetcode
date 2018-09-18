package bitoperation;

public class SingleNumber136 {
    public int findSingleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result = result ^ n;
        }

        return result;
    }
}
