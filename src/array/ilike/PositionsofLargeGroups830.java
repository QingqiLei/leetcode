package array.ilike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
 *
 * The final answer should be in lexicographic order.
 */
public class PositionsofLargeGroups830 {
    public static List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;

        for (int i = 1; i <= S.length(); i++) {
            if (i == S.length() || S.charAt(i) != S.charAt(start)) {
                // when i == S.length(), it means that the last elements  == S.charAt(start)
                if (i - start >= 3)
                    ans.add(Arrays.asList(start, i - 1));
                start = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
    }
}
