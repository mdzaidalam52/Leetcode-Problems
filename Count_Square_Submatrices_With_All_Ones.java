class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = matrix[i][j];
                ans += matrix[i][j];
            }
        }
        
        for(int i = 1; i < Math.min(n, m); i++){
            for(int j = n-1; j >= i; j--){
                for(int k = m - 1; k >= i; k--){
                    if(dp[j][k] == 1 && dp[j-1][k-1] == 1 && dp[j-1][k] == 1 && dp[j][k-1] ==1){
                        ans++;
                    }else{
                        dp[j][k] = 0;
                    }
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam