// class Solution {
//     public int maxProfit(int[] prices) {
//         return transaction(prices, 0);
//     }
//     public int transaction(int[] prices, int startDay) {
//         if(startDay >= prices.length) return 0;
        
//         int maxProfit = 0;
//         for(int i=startDay; i<prices.length; i++) {
//             int max = 0;
//             for(int j=i+1; j<prices.length; j++) {
//                 if(prices[j] > prices[i]) {
//                     int profit = prices[j] - prices[i] + transaction(prices, j+1);
//                     max = Math.max(max, profit);
//                 }
//             }
//             maxProfit = Math.max(max, maxProfit);
//         }
//         return maxProfit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]>prices[i-1])
                maxProfit += prices[i]-prices[i-1];
        }
        return maxProfit;
    }
}
