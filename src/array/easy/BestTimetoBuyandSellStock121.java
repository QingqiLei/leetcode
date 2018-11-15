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

    /**
     * for each stack, we have three action, buy, sell,rest
     *
     * (i)no in hand  = (i-1) no in hand  ? (i-1) in hand + price
     *
     * (i) in hand = (i-1) in hand ? ( i -1) not in hand - price
     *
     *
     * @param prices
     * @return
     */

    public int maxProfit(int[] prices) {
        int i10 = 0, i11 = Integer.MIN_VALUE;
        for(int i: prices){
            i10 = Math.max(i10, i11 + i);
            i11 = Math.max(i11, -i);

        }
        return i10;

    }
}
