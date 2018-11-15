package array.medium;

public class BestTimetoBuyandSellStockwithTransactionFee714 {
    public int maxProfit(int[] prices, int fee) {
        long ik0 = 0, ik1 = Integer.MIN_VALUE;
        for(int i : prices){
            long old = ik0;
            ik0 = Math.max(ik0, ik1 + i - fee);
            ik1 = Math.max(ik1, old - i);
        }
        return (int)ik0;
    }
}
