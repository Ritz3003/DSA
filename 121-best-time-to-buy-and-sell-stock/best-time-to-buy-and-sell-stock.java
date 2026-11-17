class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int bestProfit = 0;
        

        for(int i = 1;i<prices.length;i++){
            int cp = prices[i] - min;
            bestProfit = Math.max(cp,bestProfit);
            min = Math.min(min,prices[i]);
        }

        return bestProfit;
        
    }
}