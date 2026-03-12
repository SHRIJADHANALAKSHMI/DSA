class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
/*
Initially:minPrice = very large number
maxProfit:
Stores the maximum profit found so far.
maxProfit = 0
Loop Through Prices:This loop checks each day's price.
ex:
Day:    0  1  2  3  4  5
Price: [7, 1, 5, 3, 6, 4]
If current price is lower than previous minimum, update it.
If selling at current price yields more profit than previously recorded, update maxProfit.
This calculates profit if sold today.

profit = current price - minimum price
*/