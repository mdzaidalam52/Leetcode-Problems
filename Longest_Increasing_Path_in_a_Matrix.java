class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        int ans = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j])
                    continue;
                dp[i][j] = dfs(matrix, i, j, vis, dp, -1);
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans;
    }
    public int dfs(int[][] a, int y, int x, boolean[][] vis, int[][] dp, int prev){
        if(y == a.length || y == -1 || x == -1 || x == a[0].length || a[y][x] <= prev)
            return 0;
        if(vis[y][x])
            return dp[y][x];
        vis[y][x] = true;
        prev = a[y][x];
        dp[y][x] = Math.max(dfs(a, y+1, x, vis, dp, prev), dfs(a, y-1, x, vis, dp, prev));
        dp[y][x] = Math.max(dp[y][x], dfs(a, y, x+1, vis, dp, prev));
        dp[y][x] = Math.max(dp[y][x], dfs(a, y, x-1, vis, dp, prev));
        dp[y][x]++;
        return dp[y][x];
    }
}

// Code by Md Zaid Alam