class Solution {
    public long getDescentPeriods(int[] prices) {
        if(prices.length == 1)
            return 1;
        long ans = 0, count = 0;
        for(int i = 0; i < prices.length; i++){
            if(i == 0){
                count++;
            }else if(prices[i]+1 == prices[i-1]){
                count++;
                if(i == prices.length-1){
                    ans += count*(count + 1)/2;
                    count = 0;
                }
            }else{
                ans += count*(count + 1)/2;
                count = 1;
            }
        }
        return ans + count*(count+1)/2;
    }
}

// Code by Md Zaid Alam