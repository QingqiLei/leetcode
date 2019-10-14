package Math.easy;

import java.util.ArrayList;
import java.util.List;

public class PathInZigzagLabelledBinaryTre1104 {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ret = new ArrayList<>();
        int cur = label;
        while(true){
            ret.add(0, cur);
            if(cur == 1)break;
            cur /= 2;
            int h = Integer.highestOneBit(cur);
            cur ^= h-1;
        }
        return ret;
    }
}
