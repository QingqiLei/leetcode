package dp.medium;

import java.util.HashMap;
import java.util.Map;

public class RabbitsinForest781 {
    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : answers) m.put(i, m.getOrDefault(i, 0) + 1);
        int res = 0;
        for (int i : m.keySet())
            res += (m.get(i) + i) / (i + 1) * (i + 1);
        return res;
    }

    public static void main(String[] args) {
        numRabbits(new int[]{10, 10, 10, 10, 10});
//        System.out.println(Math.ceil);
    }
}
