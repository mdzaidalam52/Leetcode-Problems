class Solution {
    public int closedIsland(int[][] grid) {
        if(grid != null && grid.length < 3 || grid[0].length < 3)
            return 0;
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j] || grid[i][j] == 1)
                    continue;
                if(check(grid, i, j, vis)){
                    ans++;
                }
            }
        }
        
        return ans;
    }
    
    boolean check(int[][] grid, int y, int x, boolean[][] vis){
        if(y < 0 || x < 0 || grid.length == y || grid[0].length == x)
            return false;
        if(grid[y][x] == 1 || vis[y][x])
            return true;
        
        vis[y][x] = true;
        boolean ans = true;
        
        ans = ans & check(grid, y+1, x, vis);
        ans = ans & check(grid, y-1, x, vis);
        ans = ans & check(grid, y, x+1, vis);
        ans = ans & check(grid, y, x-1, vis);
        return ans;
        
    }
}

// Code by Md Zaid Alam