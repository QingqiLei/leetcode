package dp.updateEveryTime;

import java.util.List;
// determine if s can be segmented into a space-separated sequence of one or more dictionary words.
//
public class WordBreak139 {
    public static  boolean wordBreak(String s, List<String> dict) {
        boolean[] f = new boolean[s.length() +1];
        for(int i = 1; i <=s.length(); i++)
            for(int j = 0; j < i; j++)
                // include j, exclude i;
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
        return f[s.length()];
    }
}
