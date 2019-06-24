package array.ilike;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DistantBarcodes1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>((a, b) ->(b.getValue() - a.getValue()));
        Map<Integer, Integer> map  = new HashMap();
        for(int e : barcodes) map.put(e,map.getOrDefault(e,0)+1);
        pq.addAll(map.entrySet());
        int i = 0;
        int[] res = new int[barcodes.length];
        while(!pq.isEmpty()){
            Map.Entry<Integer, Integer> top = pq.poll();
            if(i == 0 || res[i-1] != top.getKey()){
                res[i] = top.getKey();
                top.setValue(top.getValue() -1);
                if(top.getValue() != 0) pq.offer(top);
            }else{
                Map.Entry<Integer, Integer> second = pq.poll();
                res[i] = second.getKey();
                second.setValue(second.getValue() -1);
                if(second.getValue() != 0) pq.offer(second);
                pq.offer(top);
            }
            i++;
        }
        return res;
    }
}
