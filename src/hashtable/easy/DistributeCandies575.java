package hashtable.easy;

import java.util.Arrays;

public class DistributeCandies575 {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int kinds = 0, pre = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] != pre) {
                kinds++;
                pre = candies[i];
            }
        }
        if (kinds >= candies.length / 2) return candies.length / 2;
        else return kinds;

    }
}
