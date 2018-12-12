package dp.medium;

import java.util.Arrays;

// pairs[n-1][1] < pairs[n][0] && pairs[n][0] < pairs[n][1]

public class MaximumLengthofPairChain646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int sum = 0, n = pairs.length, i = -1;
        while (++i < n) {
            sum++;
            int curEnd = pairs[i][1];
            while (i + 1 < n && curEnd >= pairs[i + 1][0]) i++;
        }
        return sum;
    }
}
