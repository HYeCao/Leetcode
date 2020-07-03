package e_7July;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<prices[i-1])res+=prices[i-1]-prices[i];
        }
        return res;
    }
}
