package f_8August;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(res < (prices[j] - prices[i])) {
                    res = prices[j] - prices[i];
                }
            }
        }
        return res;
    }
}
