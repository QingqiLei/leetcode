package array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class PascalTriangleII119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex );
        result.add(1);
        for(int i = 1; i < rowIndex+1; i ++){
            int val = (int)((long)result.get(i-1) *(rowIndex - (i-1))/i);
            result.add(i,val);
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(getRow(30));
    }
}
