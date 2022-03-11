class NumMatrix {
    int[][] a;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        a = new int[n][m];
        a[0][0] = matrix[0][0];
        for (int i = 1; i < m; i++) {
            a[0][i] = matrix[0][i] + a[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            a[i][0] = matrix[i][0] + a[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int val = a[row2][col2];
        if (row1 > 0 && col1 > 0)
            val += a[row1 - 1][col1 - 1];
        if (row1 > 0)
            val -= a[row1 - 1][col2];
        if (col1 > 0)
            val -= a[row2][col1 - 1];
        return val;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

// Code by Md Zaid Alam