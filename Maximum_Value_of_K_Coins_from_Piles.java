class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        for(List<Integer> l: piles){
            for(int i = 1; i < l.size(); i++){
                l.set(i, l.get(i) + l.get(i-1));
            }
        }
        int[][] dp = new int[piles.size()][k+1];
        for(int i = 0; i < piles.size(); i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(piles, dp, k, 0);
    }
    
    int solve(List<List<Integer>> a, int[][] dp, int k, int ind){
        if(ind == a.size() || k == 0)
            return 0;
        if(dp[ind][k] != -1)
            return dp[ind][k];
        dp[ind][k] = solve(a, dp, k, ind+1);
        for(int i = 1; i <= Math.min(a.get(ind).size(), k); i++){
            dp[ind][k] = Math.max(solve(a, dp, k-i, ind+1) + a.get(ind).get(i-1), dp[ind][k]);
        }
        return dp[ind][k];
    }
}

// Code by Md Zaid Alam