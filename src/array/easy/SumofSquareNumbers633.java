package array.easy;

import java.util.HashSet;
import java.util.Set;

public class SumofSquareNumbers633 {
    public boolean judgeSquareSum(int c) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <= Math.sqrt(c); i++){
            int temp  = i*i;
            set.add(temp);
            if(set.contains(c - temp)) return true;
        }
        return false;
    }
}
