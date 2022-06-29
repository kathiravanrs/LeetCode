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
            if(a>buy){
                profit = Math.max(profit, a-buy);
            }
        }
        return profit;
        
    }
}
