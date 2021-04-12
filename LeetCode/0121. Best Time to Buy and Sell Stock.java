class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                int profit = prices[j]-prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}

/*
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minPrice) 
                minPrice = prices[i];
            if(maxProfit < prices[i]-minPrice)
                maxProfit = prices[i]-minPrice;
        }
        
        return maxProfit;
    }
}
*/
