package IntString.medium;

import java.util.HashSet;
import java.util.Set;

public class BitwiseORsofSubarrays898 {
    //O(30N)
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> res = new HashSet<>(), cur = new HashSet<>(), cur2;
        for(Integer i: A){
            cur2 = new HashSet<>();
            cur2.add(i);
            for(Integer j : cur) cur2.add(i|j);
            res.addAll(cur = cur2);
        }
        return res.size();
    }


}
