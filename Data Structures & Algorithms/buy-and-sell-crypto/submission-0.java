class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int n:prices)
        {
            if(n<min)
            min=n;
            profit=Math.max(profit,n-min);
        }
        return profit;
    }
}
