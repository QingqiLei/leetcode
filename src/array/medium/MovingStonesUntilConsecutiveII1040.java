package array.medium;

import java.util.Arrays;

public class MovingStonesUntilConsecutiveII1040 {
    public int[] numMovesStonesII(int[] s) {
        Arrays.sort(s);
        int n = s.length, i = 0;
        int high = Math.max(s[n - 1] - s[1] - 1 - (n - 3), s[n - 2] - s[0] - 1 - (n - 3)), low = n;
        for (int j = 0; j < n; j++) {
            while (s[j] - s[i] > n - 1) i++;
            if (s[j] - s[i] == n - 2 && j - i == n - 2) low = Math.min(low, 2);
            else low = Math.min(low, n - (j - i + 1));
        }
        return new int[]{low, high};
    }

}
