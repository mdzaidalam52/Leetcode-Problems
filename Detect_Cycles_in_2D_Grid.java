class Solution {
    public boolean containsCycle(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j])
                    continue;
                if(check(grid, i, j, -1, -1, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean check(char[][] g, int y, int x, int py, int px, boolean[][] vis) {
        if(y < 0 || x < 0 || y >= g.length || x >= g[0].length || (py != -1 && px != -1 && g[y][x] != g[py][px])){
            return false;
        }
        if(vis[y][x])
            return true;
        vis[y][x] = true;
        boolean ans = false;
        if(y+1 != py || x != px)
            ans = ans || check(g, y+1, x, y, x, vis);
        if(y-1 != py || x != px)
            ans = ans || check(g, y-1, x, y, x, vis);
        if(y != py || x+1 != px)
            ans = ans || check(g, y, x+1, y, x, vis);
        if(y != py || x-1 != px)
            ans = ans || check(g, y, x-1, y, x, vis);
        return ans;
    }
}

// Code by Md Zaid Alam