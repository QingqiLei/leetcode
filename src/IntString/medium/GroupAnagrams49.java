package IntString.medium;

import java.util.*;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] strchar = str.toCharArray();
            Arrays.sort(strchar);
            List<String> list = map.getOrDefault(String.valueOf(strchar), new ArrayList<String>());
            list.add(str);
            map.put(String.valueOf(strchar), list);
        }

        return new ArrayList<List<String>>(map.values());
    }

}
