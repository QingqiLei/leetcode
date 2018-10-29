package binarysearch.easy;

import java.util.Arrays;

public class Heaters475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int max = 0, i = 0;

        /**
         * the fact: let house *2 > heaters[i] + heaters[i + 1], making sure that house is close to the left heaters.
          */
        for (int house : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= house * 2)
                i++;

            max = Math.max(max, Math.abs(heaters[i] - house));

        }
        return max;
    }
}
