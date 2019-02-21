package Math.medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence60 {
    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i); // now, the nums is the smallest
        int total = 1;
        for (int i = 1; i < n; i++) total *= i; // the number of transformation of n-1 numbers
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            int idx = (k - 1) / total;
            sb.append(nums.get(idx));
            nums.remove(idx);
            k -= idx * total;
            total /= --n;
        }
        sb.append(nums.get(0));
        return sb.toString();
    }

    public static void main(String[] args) {
        getPermutation(4, 6);
    }
}
