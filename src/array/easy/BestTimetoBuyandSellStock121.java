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
            if(prices[i]< soFarLow){
                soFarLow = prices[i];
            }else if(prices[i]>soFarLow){
                profit= Math.max(profit,prices[i]-soFarLow);
            }
        }
        return profit;

    }
}
