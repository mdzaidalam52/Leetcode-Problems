class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    ans = Math.max(ans, solve(grid, i, j, vis));
                }
            }
        }
        return ans;
    }
    
    public int solve(int[][] a, int y, int x, boolean[][] vis){
        if(y < 0 || x < 0 || y == a.length || x == a[0].length || a[y][x] == 0 || vis[y][x]){
            return 0;
        }
        vis[y][x] = true;
        int ans = 1;
        ans += solve(a, y+1, x, vis);
        ans += solve(a, y, x+1, vis);
        ans += solve(a, y, x-1, vis);
        ans += solve(a, y-1, x, vis);
        return ans;
    }
}

// Code by Md Zaid Alam