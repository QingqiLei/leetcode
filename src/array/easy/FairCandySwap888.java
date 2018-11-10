package array.easy;

import java.util.HashSet;
import java.util.stream.IntStream;

public class FairCandySwap888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) /2;
        HashSet<Integer> s = new HashSet<>();
        for(int a : A) s.add(a);
        for(int b:B) if (s.contains( b + dif)) return new int[]{b + dif, b};
        return new int[0];
    }
}
