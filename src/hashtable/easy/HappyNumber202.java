package hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * nice solution
 */
public class HappyNumber202 {
    public boolean isHappy(int n) {
        Set<Integer> temp = new HashSet<>();
        int squareSum;
        while (temp.add(n)) {
            squareSum = 0;
            while (n > 0) {
                squareSum += (n % 10) * (n % 10);  // note： n%10 * n %10   wrong
                n /= 10;
            }

            n = squareSum;

            if (squareSum == 1)
                return true;
            else
                n = squareSum;
        }
        return false;
    }

}
