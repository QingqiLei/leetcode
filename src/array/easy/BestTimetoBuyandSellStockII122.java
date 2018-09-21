package array.easy;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 */
public class BestTimetoBuyandSellStockII122 {
    public static int maxProfit(int[] prices) {

        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) total += prices[i + 1] - prices[i];
        }

        return total;

    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));

    }
}
