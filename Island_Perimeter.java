class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1)
                    return solve(grid, i, j, new boolean[grid.length][grid[0].length]);
            }
        }
        return 0;
    }
    public int solve(int[][] a, int y, int x, boolean[][] vis){
        if(y < 0 || x < 0 || y == a.length || x == a[0].length || a[y][x] == 0){
            return 1;
        }
        if(vis[y][x])
            return 0;
        vis[y][x] = true;
        int ans = solve(a, y+1, x, vis);
        ans += solve(a, y, x+1, vis);
        ans += solve(a, y, x-1, vis);
        ans += solve(a, y-1, x, vis);
        return ans;
    }
}

// Code by Md Zaid Alam