package graph.medium;

import java.util.*;


// BFS
public class ShortestPathwithAlternatingColors1129 {
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        Map<Integer, HashSet<Integer>> red = new HashMap<>(), blue = new HashMap<>();

        for(int[] i: red_edges){
            red.putIfAbsent(i[0],new HashSet<Integer>());
            red.get(i[0]).add(i[1]);
        }
        for(int[] i: blue_edges){
            blue.putIfAbsent(i[0],new HashSet<Integer>());
            blue.get(i[0]).add(i[1]);
        }

        HashSet<String> seen = new HashSet<String>();
        Queue<int[]> q = new LinkedList<>();
        // {cur, next color(1:red, 2:blue, 0:all)}
        q.add(new int[]{0,0});
        int path = 0;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        // res[0] = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i  = 0; i < size; i++){
                int[] cur = q.poll();
                String key = cur[0]+" "+cur[1];
                if(seen.contains(key)) continue;
                seen.add(key);
                if(res[cur[0]] == -1) res[cur[0]] = path;

                if((cur[1] == 1 || cur[1] == 0 ) && red.get(cur[0]) != null)
                    for(int t: red.get(cur[0]))
                        q.offer(new int[]{t,2});
                if((cur[1] == 2|| cur[1] == 0) && blue.get(cur[0]) != null)
                    for(int t: blue.get(cur[0]))
                        q.offer(new int[]{t,1});


            }

            path++;
        }
        return res;



    }
}
