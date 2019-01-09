package array.onepass;
// find longest substring ends with each letter
//
public class UniqueSubstringsinWraparoundString467 {
    // O(N)
    public int findSubstringInWraproundString(String p) {
        int[] array = new int[26];
        int res = 0, cur = 0;
        for (int i = 0; i < p.length(); i++) {
            if (i == 0 || p.charAt(i) - p.charAt(i - 1) == 1
                    || p.charAt(i - 1) == 'z' && p.charAt(i) == 'a') {
                cur++;
            } else {
                cur = 1;
            }
            array[p.charAt(i) - 'a'] = Math.max(array[p.charAt(i) - 'a'], cur);

        }
        for (int i = 0; i < array.length; i++)
            res += array[i];
        return res;
    }
}
