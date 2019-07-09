package heap;

import java.util.Map;
import java.util.TreeMap;

public class OddEvenJump975 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 2);
//        map.put(2,3);
        map.put(3, 4);
        System.out.println(map.ceilingKey(2)); //3
    }

    public int oddEvenJumps(int[] A) {
        int n = A.length, res = 1;
        boolean[] high = new boolean[n], low = new boolean[n];
        high[n - 1] = true;
        low[n - 1] = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = A.length - 1; i >= 0; i--) {
            Map.Entry<Integer, Integer> hi = map.ceilingEntry(A[i]), lo = map.floorEntry(A[i]);
            if (hi != null) low[i] = high[hi.getValue()];
            if (lo != null) high[i] = low[lo.getValue()];
            map.put(A[i], i);
            if (low[i] == true) res++;
        }
        return res;
    }
}
