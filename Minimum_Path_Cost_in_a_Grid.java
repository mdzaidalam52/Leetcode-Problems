class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int n = grid.length, m = grid[0].length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = grid[0][i];
        }
        for (int i = 1; i < n; i++) {
            int[] t = new int[m];
            for (int j = 0; j < m; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    min = Math.min(min, grid[i][j] + moveCost[grid[i - 1][k]][j] + ans[k]);
                }
                t[j] = min;
            }
            for (int j = 0; j < m; j++) {
                ans[j] = t[j];
            }
        }
        int an = Integer.MAX_VALUE;
        for (int i : ans) {
            an = Math.min(an, i);
        }
        return an;
    }
}

// Code by Md Zaid Alam