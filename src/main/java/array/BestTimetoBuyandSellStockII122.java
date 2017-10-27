package array;

/**
 * Created by fengliejv on 2017/10/27.
 */
public class BestTimetoBuyandSellStockII122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int num = prices[i]-prices[i-1];
            if(num>0){
                profit+=num;
            }
        }
        return profit;
    }
}
