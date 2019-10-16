package stack.monotone;

import java.util.Stack;

public class MaximalRectangle85 {
    public int maximalRectangle(char[][] matrix) {
        int h[] = new int[matrix[0].length];
        int res = 0;
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++)
                h[j]= (matrix[i][j]=='1')? h[j]+1:0;

            res = Math.max(res, findMaxRec(h));
        }
        return res;
    }


    public int findMaxRec(int[] h){
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for(int i = 0; i <= h.length; i++){
            int height = i == h.length? 0:h[i];
            while(!s.isEmpty() && height <= s.peek())
                res = Math.max(res, h[s.pop()] * (s.isEmpty()? i: i-1-s.peek()));
            s.push(i);
        }
        return res;
    }
}
