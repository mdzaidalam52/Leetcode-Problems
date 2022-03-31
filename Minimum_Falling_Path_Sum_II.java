class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        for (int i = 1; i < n; i++) {
            int[] ind = find(grid[0]);
            for (int j = 0; j < n; j++) {
                if (grid[0][j] == ind[0]) {
                    grid[0][j] = ind[1] + grid[i][j];
                } else {
                    grid[0][j] = ind[0] + grid[i][j];
                }
            }
        }
        return find(grid[0])[0];

    }

    int[] find(int[] a) {
        int c = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (b > a[i]) {
                c = b;
                b = a[i];
            } else if (c > a[i]) {
                c = a[i];
            }
        }
        return new int[] { b, c };
    }
}

// Code by Md Zaid Alam