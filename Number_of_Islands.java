class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    ans++;
                    vis[i][j] = true;
                    visit(grid, i, j, vis);
                }
            }
        }
        return ans;
    }
    
    public void visit(char[][] a, int i, int j, boolean[][] vis){
        if(i > 0 && a[i-1][j] == '1' && !vis[i-1][j]){
            vis[i-1][j] = true;
            visit(a, i-1, j, vis);
        }
        
        if(j > 0 && a[i][j-1] == '1' && !vis[i][j-1]){
            vis[i][j-1] = true;
            visit(a, i, j-1, vis);
        }
        
        if(j < a[0].length-1 && a[i][j+1] == '1' && !vis[i][j+1]){
            vis[i][j+1] = true;
            visit(a, i, j+1, vis);
        }
        
        if(i < a.length-1 && a[i+1][j] == '1' && !vis[i+1][j]){
            vis[i+1][j] = true;
            visit(a, i+1, j, vis);
        }
    }
}

// Code by Md Zaid Alam