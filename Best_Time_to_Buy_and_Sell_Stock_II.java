class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 
        int ans = 0;
        for(int i = 1; i < n; i++){
            ans += Math.max(0, prices[i] - prices[i-1]);
        }
        return ans; 
    }
}

// Code by Md Zaid Alam