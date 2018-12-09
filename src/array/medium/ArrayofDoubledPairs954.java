package array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ArrayofDoubledPairs954 {
    public static  boolean canReorderDoubled(int[] A) {
        Arrays.sort(A);
        Map<Integer, Integer> map = new HashMap();
        for(int i : A) map.put(i,map.getOrDefault(i,0)+1);
        map.keySet().forEach(s-> System.out.println(s));
        for(int i = 0; i < A.length;i++){
            if(A[i] < 0){
                if(map.get(A[i]) == 0) continue;
                if(A[i] %2 != 0) return false;
                if(map.get(A[i]/2) == null ) return false;
                map.put( A[i],map.get(A[i])-1);
                map.put(A[i]/2, map.get(A[i]/2) -1);
            }else{
                if(map.get(A[i]) == 0) continue;
                if((map.get(2 *A[i]) == null) || map.get(2*A[i]) == 0) return false;
                map.put( A[i],map.get(A[i])-1);
                map.put(2*A[i], map.get(A[i]*2) -1);

            }
        }
        return true;
    }
    public static  boolean canReorderDoubled1(int[] A) {
        Map<Integer, Integer> count = new TreeMap<>();
        for(int a :A) count.put(a, count.getOrDefault(a,0)+1);
        for(int x : count.keySet()){
            if(count.get(x) == 0) continue;
            int want = x < 0? x /2 : x * 2;
            if(x < 0 && x % 2 == 1 || count.get(x) > count.getOrDefault(want, 0)) return false;
            count.put(want,count.get(want) - count.get(x));
        }
        return true;
    }
}
