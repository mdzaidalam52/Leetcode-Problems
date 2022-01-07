class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1) 
                    continue;
                grid[i][j] = 201;
                if(i > 0)
                    grid[i][j] = Math.min(grid[i][j], grid[i-1][j]+1);
                if(j > 0)
                    grid[i][j] = Math.min(grid[i][j], grid[i][j-1]+1);
            }
        }
        int ans = 0;
        for(int i = n-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(grid[i][j] == 1)
                    continue;
                
                if (i < n-1) 
                    grid[i][j] = Math.min(grid[i][j], grid[i+1][j] + 1);
                if (j < n-1) 
                    grid[i][j] = Math.min(grid[i][j], grid[i][j+1] + 1);
                ans = Math.max(ans, grid[i][j]);
            }
        }
        return ans == 201 ? -1 : ans-1;
    }
}

// Code by Md Zaid Alam