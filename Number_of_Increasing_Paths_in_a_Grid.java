class Solution {
    final long mod = 1000000007;
    public int countPaths(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        long[][] ans = new long[n][m];
        
        for(int i = 0; i < n; i++){
            Arrays.fill(ans[i], -1);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(ans[i][j] == -1){
                    dfs(grid, i, j, ans);
                }
            }
        }
        
        long a = 0;
        for(long[] arr: ans){
            for(long i: arr){
                a = (a + i)%mod;
            }
        }
        return (int)a;
        
    }
    
    long dfs(int[][] a, int y, int x, long[][] ans){
        if(ans[y][x] != -1){
            return ans[y][x];
        }
        
        long depth = 1;
        if(y < a.length - 1 && a[y+1][x] > a[y][x]){
            depth += dfs(a, y+1, x, ans);
        }
        
        if(x < a[0].length - 1 && a[y][x+1] > a[y][x]){
            depth += dfs(a, y, x+1, ans);
        }
        
        if(x > 0 && a[y][x-1] > a[y][x]){
            depth += dfs(a, y, x-1, ans);
        }
        
        if(y > 0 && a[y-1][x] > a[y][x]){
            depth += dfs(a, y-1, x, ans);
        }
        
        ans[y][x] = depth%mod;
        return ans[y][x];
    }
}

// Code by Md Zaid Alam