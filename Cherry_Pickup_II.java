class Solution {
    public int cherryPickup(int[][] grid) {
        int[] dir = new int[]{1, 0, -1};
        int n = grid.length; 
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for(int[][] a: dp){
            for(int[] b: a){
                Arrays.fill(b, -1);
            }
        }
        dp[0][0][m-1] = grid[0][0] + grid[0][m-1];
        int max = dp[0][0][m-1];
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < m; k++){
                    int prev = dp[i-1][j][k];
                    if(prev >= 0){
                        for(int d1: dir){
                            int col1 = d1 + j;
                            for(int d2: dir){
                                int col2 = d2 + k;
                                if(range(col1, m) && range(col2, m)){
                                    dp[i][col1][col2] = Math.max(dp[i][col1][col2], prev + ((col1 == col2) ? grid[i][col1] : (grid[i][col1] + grid[i][col2])));
                                    max = Math.max(max, dp[i][col1][col2]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return max;
    }
    
    boolean range(int a, int b){
        return a >= 0 && a < b;
    }
}

// Code by Md Zaid Alam