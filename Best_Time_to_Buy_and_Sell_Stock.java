class Solution {
    public int maxProfit(int[] prices) {
        int ans = Integer.MIN_VALUE;
        int min = prices[0];
        for(int val : prices){
            if(val < min){
                min = val;
            }
            ans = Math.max(ans, val - min);
            
            
        }
        
        if(ans >= 0)
            return ans;
        else
            return 0;
    }
}


// Code by Md Zaid Alam