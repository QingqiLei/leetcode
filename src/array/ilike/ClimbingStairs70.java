package array.ilike;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs70 {
    public int climbStairs(int n) {     //basically it's a fibonacci
        if (n == 1) return 1;
        if (n == 2) return 2;
        int result = 2;
        int last = 1;
        while (n > 2) {
            n--;
            int temp = result;
            result = result + last;
            last = temp;
        }
        return result;
    }
}
