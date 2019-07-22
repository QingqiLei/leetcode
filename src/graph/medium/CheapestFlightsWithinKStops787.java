package graph.medium;

import java.util.*;

public class CheapestFlightsWithinKStops787 {
    // Bellman-Ford
    //O(n*flights.length)  // this is like bfs
    public int findCheapestPrice1(int n, int[][] flights, int src, int dst, int k) {
        int[] cost = new int[n];
        Arrays.fill(cost, 100000);
        cost[src] = 0;
        int ans = cost[dst];
        for (int i = k; i >= 0; i--) {
            int[] cur = new int[n];
            Arrays.fill(cur, 100000);
            for (int[] flight : flights) {
                cur[flight[1]] = Math.min(cur[flight[1]], cost[flight[0]] + flight[2]);
            }
            cost = cur;
            ans = Math.min(ans, cost[dst]);
        }
        return ans == 100000 ? -1 : ans;
    }


    // TLE !!!!!
    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> store = new HashMap();
        for (int[] flight : flights) {
            if (!store.containsKey(flight[0])) store.put(flight[0], new HashMap<Integer, Integer>());
            store.get(flight[0]).put(flight[1], flight[2]);
        }
        Queue<int[]> pq = new LinkedList<>();
        pq.add(new int[]{0, src, k});
        int res = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stop = top[2];
            if (city == dst) res = Math.min(res, price);
            if (stop >= 0) {
                Map<Integer, Integer> adj = store.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) pq.add(new int[]{price + adj.get(a), a, stop - 1});
            }
        }
        return res== Integer.MAX_VALUE?-1:res;
    }


        // Dijkstra  , get the cheapest each time, return the price find in the first time
    // when find the result, the result is the smallest in the PriorityQueue, so it's the cheapest
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> store = new HashMap();
        for (int[] flight : flights) {
            if (!store.containsKey(flight[0])) store.put(flight[0], new HashMap<Integer, Integer>());
            store.get(flight[0]).put(flight[1], flight[2]);
        }
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[]{0, src, k});
        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stop = top[2];
            if (city == dst) return price;
            if (stop >= 0) {
                Map<Integer, Integer> adj = store.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) pq.add(new int[]{price + adj.get(a), a, stop - 1});
            }
        }
        return -1;
    }
}
