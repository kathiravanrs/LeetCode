class Solution {

    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int profit = 0;
        for(int a: prices){
            if(a<buy){
                buy = a;
                continue;
            }
            if(a>=buy){
                sell = a;
                profit = Math.max(profit, sell-buy);
            }
        }
        return profit;
        
    }
}
