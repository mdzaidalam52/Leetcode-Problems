class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int s = 0, t = 0, n = days.length;
        int[] dp = new int[n+1];
        for(int i = 0; i < n; i++){
            while(days[i] - days[s] >= 7){
                s++;
            }
            while(days[i] - days[t] >= 30){
                t++;
            }
            dp[i+1] = dp[i] + costs[0];
            dp[i+1] = Math.min(dp[i+1], dp[s] + costs[1]);
            dp[i+1] = Math.min(dp[i+1], dp[t] + costs[2]);
        }
        return dp[n];
    }
}

// Code by Md Zaid Alam