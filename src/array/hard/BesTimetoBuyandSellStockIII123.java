package array.hard;

public class BesTimetoBuyandSellStockIII123 {
    public int maxProfit(int[] prices) {
        int i10 = 0, i11 = -Integer.MIN_VALUE,
                i20 = 0, i21 = -Integer.MIN_VALUE;
        for(int i: prices){
            i20 = Math.max(i20, i21 + i);
            i21 = Math.max(i21,  i10 - i);
            i10 = Math.max( i10, i11 +i);
            i11 = Math.max(i11, -i); // 因为i11初始化为负无穷，第一次会买
        }
        return i20;
    }

    }
