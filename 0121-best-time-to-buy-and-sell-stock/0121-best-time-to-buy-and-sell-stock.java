class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxprofit = 0 ;
        int n = prices.length;
        int min = prices[0];
        for(int i = 1; i<n ;i++)
        {
            int cost = prices[i]-min;
            maxprofit = Math.max(maxprofit,cost);
            min = Math.min(min, prices[i]);
        }
        return maxprofit;
    }
}