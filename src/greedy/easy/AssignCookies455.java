package greedy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignCookies455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;  i<g.length && j<s.length;  j++) {// 每次 j +1
            if(g[i]<=s[j]) i++;        // 如果 饼干大于需求， 就让需求++
        }
        return i;
    }

    public static int findContentChildren2(int[] g, int [] s){
        Arrays.sort(g);
        Arrays.sort(s);
        List<Integer> list = new ArrayList<>();
        for(int i : s)
            list.add(i);
        int ans = 0;
        int curr = 0;
        for(int need: g){
            while(curr < list.size() && list.get(curr) < need)
                curr ++;
            if(curr < list.size()&&list.get(curr)>=need){
                ans ++;
                curr++;
            }else{
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args){

        findContentChildren(new int[]{1,2,3}, new int[]{6});
        findContentChildren2(new int[]{1,2,3}, new int[]{6});
    }

    }
