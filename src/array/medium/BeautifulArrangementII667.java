package array.medium;

public class BeautifulArrangementII667 {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        for(int i = 0, left = 1, right = n; right > left; i++){
            ans[i] = k > 1? (k-- % 2 == 0? right -- : left ++): left++;
        }
        return ans;
    }
}
