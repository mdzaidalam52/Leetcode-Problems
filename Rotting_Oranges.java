class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                switch(grid[i][j]){
                    case 1:
                        grid[i][j] = Integer.MAX_VALUE;
                        break;
                    case 2:
                        grid[i][j] = 0;
                        break;
                    case 0:
                        grid[i][j] = -1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0){
                    solve(grid, i+1, j, 1);
                    solve(grid, i-1, j, 1);
                    solve(grid, i, j+1, 1);
                    solve(grid, i, j-1, 1);
                    
                }
            }
        }
        
        int k = 0;
        for(int[] a: grid){
            for(int i: a)
                if(i != -1)
                    k = Math.max(k, i);
        }
        return (k == Integer.MAX_VALUE ? -1 : k);
    }
    
    void solve(int[][] grid, int y, int x, int dist){
        if(y >= grid.length || y < 0 || x >= grid[0].length || x < 0 || grid[y][x] == -1 || grid[y][x] <= dist){
            return;
        }
        grid[y][x] = dist;
        solve(grid, y+1, x, dist+1);
        solve(grid, y-1, x, dist+1);
        solve(grid, y, x+1, dist+1);
        solve(grid, y, x-1, dist+1);
    }
}

// Code by Md Zaid Alam