class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int ans = 0;
            for(int j = 1; j < i; j++){
                ans = Math.max(ans, j*dp[i-j]);
            }
            if(i != n)
            	dp[i] = Math.max(i, ans);
            else
            	dp[i] = ans;
        }
        return dp[n];
    }
}

// Code by Md Zaid Alam