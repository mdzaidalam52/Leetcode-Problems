class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = colSum.length;
        int n = rowSum.length;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int k = Math.min(rowSum[i], colSum[j]);
                a[i][j] = k;
                rowSum[i] -= k;
                colSum[j] -= k;
            }
        }
        return a;
    }
}

// Code by Md Zaid Alam