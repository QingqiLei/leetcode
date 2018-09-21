package bitoperation;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber136 {
    public int findSingleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result = result ^ n;
        }

        return result;
    }
}
