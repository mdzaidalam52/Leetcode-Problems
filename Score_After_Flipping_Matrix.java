class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1)
                continue;
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = 1 - grid[i][j];
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                k += grid[j][i];
            }
            if (k <= n / 2) {
                flip(grid, i);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < grid[0].length; j++) {
                k = (k << 1) + grid[i][j];
            }
            ans += k;
        }
        return ans;
    }

    void flip(int[][] a, int ind) {
        for (int i = 0; i < a.length; i++) {
            a[i][ind] = 1 - a[i][ind];
        }
    }
}

// Code by Md Zaid Alam