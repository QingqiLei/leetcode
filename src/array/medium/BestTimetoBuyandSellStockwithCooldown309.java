package array.medium;

/**
 * instead of T[i-1][k][0], we should actually use T[i-2][k][0] if we intend to buy on the i-th day. Everything else remains the same and the new recurrence relations are
 */
public class BestTimetoBuyandSellStockwithCooldown309 {
    public int maxProfit(int[] prices) {
        int ik0 = 0, ik1 = Integer.MIN_VALUE;
        int preik0 = 0;
        for(int i : prices){
            int oldik0 = ik0;
            ik0 = Math.max(ik0, ik1 + i);

            ik1 = Math.max(ik1, preik0 - i);
            preik0 = oldik0;
        }
        return ik0;
    }
}
