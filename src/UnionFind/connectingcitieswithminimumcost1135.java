package UnionFind;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class connectingcitieswithminimumcost1135 {
    public static int minimumCost(int N, int[][] connections) {
        Queue<int[]> pq = new PriorityQueue<>((a, b)->(a[2] - b[2]));
        UnionFind uf = new UnionFind(N + 1);
        for (int[] c : connections) {
            pq.add(c);
        }
        long sum = 0;
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            if (uf.union(c[0], c[1])) {
                sum += c[2];
            }
            if (uf.N == 2) {
                return (int)sum;
            }
        }
        return  -1;
    }
    public static void main(String[] args){
        System.out.println(minimumCost(7, new int[][]{{1,2,100},{3,4,1},{5,6,1},{2,7,1},{4,7,1},{6,7,100},{1,7,1}}));
    }
}

class UnionFind {
    int[] father;
    int N;
    public UnionFind(int n) {
        father = new int[n];
        N = n;
        Arrays.fill(father, -1);
    }
    int find(int x) {
        if (father[x] < 0) {
            return x;
        }
        return father[x] = find(father[x]);
    }
    boolean union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            father[a] = b;
            N--;
            return true;
        }
        return false;
    }
}

