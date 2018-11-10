package array.easy;

public class ShortestDistancetoaCharacter821 {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        int pos = -S.length();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == C)  pos = i;
            ans[i] = i - pos;
        }

        for(int i = S.length()-1; i>=0; i--){
            if(S.charAt(i) ==C) pos = i;
            ans[i] = Math.min(ans[i],Math.abs(i-pos));
        }
        return ans;
    }
}
