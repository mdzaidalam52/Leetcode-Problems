class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int o, z;
        int[][][] dp = new int[strs.length][m+1][n+1];
        int ans = 0;
        for(int i = 0; i < strs.length; i++){
            o = 0;
            z = 0;
            for(char c: strs[i].toCharArray()){
                if(c == '1') o++;
                else z++;
            }
            if(i != 0){
                for(int j = 0; j <= m; j++){
                    for(int k = 0; k <= n; k++){
                        if(j >= z && k >= o)
                            dp[i][j][k] = Math.max(dp[i-1][j-z][k-o]+1, dp[i-1][j][k]);
                        else
                            dp[i][j][k] = dp[i-1][j][k];
                        ans = Math.max(dp[i][j][k], ans);
                    }
                }
            }else if(z <= m && o <= n){
                dp[i][z][o] = 1;
                ans = Math.max(ans, 1);
            }
            
        }
        return ans;
    }
}

// Code by Md Zaid Alam