class Solution {
    public int maxProfit(int[] prices) {
        int num = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if( prices[i] > prices[i-1] ){
                num += prices[i] - prices[i-1];
            }
        }
        return num;
        
    }
}