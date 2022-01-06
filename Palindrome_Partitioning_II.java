class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
            if(i < n-1 && s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
            }
        }
        
        for(int i = 2; i < n; i++){
            for(int j = 0; j + i < n; j++){
                dp[j][i+j] = dp[j+1][j+i-1] && (s.charAt(j) == s.charAt(j+i));
            }
        }
        
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(dp[0][i]){
                ans[i] = 0;
                continue;
            }
            int min = i;
            for(int j = 0; j <= i; j++){
                if(dp[j][i]){
                    min = j == 0 ? 0 : Math.min(min, ans[j-1] + 1);
                }
            }
            ans[i] = min;
        }
        
        return ans[n-1];
        
    }
}

// Code by Md Zaid Alam