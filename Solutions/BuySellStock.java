public class BuySellStock{
    public int maxProfit(int[] prices) {
        int profit = 0;

        if(prices.length == 1)
            return profit;


        int buy_price = Math.min(prices[0], prices[1]);


        for(int i = 1; i < prices.length; i++){
            if(buy_price < prices[i]){
                profit += prices[i] - buy_price;
                if(i != prices.length - 1)
                    buy_price = Math.min(prices[i], prices[i+1]);
            } else {
                buy_price = prices[i];
            }

        }
        return profit;
    }
}