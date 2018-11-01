package hashtable.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 *
 * once the end - start +1 = p.length and all letter is not less than 0.
 */
public class FindAllAnagramsinaString438 {
    public static List<Integer> findAnagrams(String s, String p) {
        // input check
        List<Integer> startIndex = new ArrayList<>();
        int[] charCount = new int[26];

        for(char c : p.toCharArray()){
            charCount[c - 'a'] ++;
        }


        for(int start = 0, end = 0; end < s.length(); end ++){
            char c = s.charAt(end);
            charCount[c - 'a']--;

            while(charCount[c - 'a'] < 0){
                charCount[s.charAt(start) - 'a'] ++;
                start++;
            }

            if(end - start + 1 == p.length()) startIndex.add(start);


        }

        return startIndex;
    }

    public static void main(String[] args){
        findAnagrams("cbaebabacd","abc");


        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.put("a",1));
        System.out.println(map.put("a",2));
        System.out.println(map.put("a",3));
    }
}
