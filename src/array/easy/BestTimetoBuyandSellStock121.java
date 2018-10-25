package array.easy;

/**
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int soFarLow = prices[0];
        int profit = 0;
        for(int i = 0 ; i < prices.length; i++){
            if(prices[i]< soFarLow){   // 如果当前数字小于记录的最小的， 改变最小的
                soFarLow = prices[i];
            }else if(prices[i]>soFarLow){  // 如果当前数字大于记录的最小的，求利润
                profit= Math.max(profit,prices[i]-soFarLow);
            }
        }
        return profit;

    }
}
