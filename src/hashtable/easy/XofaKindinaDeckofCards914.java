package hashtable.easy;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class XofaKindinaDeckofCards914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: deck){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int res = 0;
        for( int i: map.values())

        res = gcd(i,res);
        return res > 1;

    }

    public int gcd(int a, int b){
        return b > 0? gcd(b, a % b): a;
    }
}
