class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        boolean bool = false;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == '1'){
                dp[i][0] = 1;
                bool = true;
            }
        }
        
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == '1'){
                dp[0][i] = 1;
                bool = true;
            }
        }
        
        int ans = bool ? 1 : 0;
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                    ans = Math.max(dp[i][j], ans);
                }
            }
        }
        
        return ans*ans;
    }
}

// Code by Md Zaid Alam