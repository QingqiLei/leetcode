package dp.hard;

public class StoneGameII1140 {
    private int[] sums;//the sum from piles[i] to the end
    private int[][] hash;
    public int stoneGameII(int[] piles) {
        if(piles == null || piles.length == 0) return 0;
        int n = piles.length;
        sums = new int[n];
        sums[n-1] = piles[n-1];
        for(int i = n -2; i>=0;i--) {
            sums[i] = sums[i+1] + piles[i]; //the sum from piles[i] to the end
        }

        hash = new int[n][n];
        return helper(piles, 0, 1);
    }
    private int helper(int[] a, int start, int M) {
        if(start == a.length) return 0;
        if(2*M >= a.length -start) return sums[start];
        if(hash[start][M] != 0) return hash[start][M];
        int min = Integer.MAX_VALUE;
        for(int x = 1; x<= 2*M; x++)
            min = Math.min(min,helper(a,start+x,Math.max(M,x)));
        hash[start][M] = sums[start] - min;
        return hash[start][M];
    }
}
