class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        
        for(int i = 1; i <= amount; i++){
            for(int a : coins){
                if(i - a >= 0 && dp[i-a] != -1){
                    if(dp[i] == -1){
                        dp[i] = dp[i-a]+1;
                    }else{
                        dp[i] = Math.min(dp[i], dp[i-a]+1);
                    }
                }
            }
        }
        return dp[amount];
    }
}

// Code by Md Zaid Alam