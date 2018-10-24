package hashtable.easy;

import java.util.*;

public class MinimumIndexSumofTwoLists599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);
            if (j != null && minSum >= i + j) {
                if (minSum > i + j) {
                    res.clear();
                    minSum = i + j;
                }
                res.add(list2[i]);
            }
        }

        return res.toArray(new String[0]);

    }
}
