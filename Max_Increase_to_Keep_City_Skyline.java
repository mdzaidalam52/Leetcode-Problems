class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] h = new int[n], v = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                h[i] = Math.max(h[i], grid[i][j]);
                v[j] = Math.max(v[j], grid[i][j]);
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans += Math.min(h[i], v[j]) - grid[i][j];
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam