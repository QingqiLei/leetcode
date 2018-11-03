package backtracking.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
 */
public class LetterCasePermutation784 {
    public List<String> letterCasePermutation(String S) {
       List<String> ans = new ArrayList<>(Arrays.asList(S));
       for(int i = 0; i < S.length(); i ++){
           for(int j = 0, size = ans.size(); S.charAt(i) > '9' && j <size;j++){
               char[] ch = ans.get(j).toCharArray();
               ch[i] ^= (1<<5);
               ans.add(String.valueOf(ch));
           }
       }
       return ans;
    }
    public static void main(String[] args){
        System.out.println((char)('a' ^ (1<<5)));
    }
}
