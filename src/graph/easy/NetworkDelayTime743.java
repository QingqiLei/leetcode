package graph.easy;

import java.util.*;

public class NetworkDelayTime743 {
    public int networkDelayTime(int[][] times, int N, int K) {

        // store edge
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < times.length; i++) {
            List<Integer> list = map.getOrDefault(times[i][0], new ArrayList<>());
            list.add(i);
            map.put(times[i][0], list);
        }
        if (map.get(K) == null) return -1;
        int[] distance = new int[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[K] = 0;
        Queue<Integer> queue = new LinkedList<>(); //这里是起点
        queue.add(K);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            int t = distance[u];
            List<Integer> list = map.get(u);
            if (list == null) continue;
            for (int n : list) {
                int next = times[n][1];
                int cost = times[n][2];
                if (distance[next] > t + cost) {
                    queue.offer(next);
                    distance[next] = t + cost;
                }
            }
        }
        int res = -1;
        for (int i = 1; i <= N; i++) {
            int d = distance[i];
            if (d == Integer.MAX_VALUE)
                return -1;
            res = d > res ? d : res;
        }
        return res;
    }
}
