class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] a = new double[query_row + 1][query_row + 1];
        if (poured == 0)
            return 0;
        a[0][0] = (double) poured;
        for (int i = 0; i < query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if ((a[i][j] - 1) / 2 >= 0) {
                    a[i + 1][j] += (a[i][j] - 1) / 2;
                    a[i + 1][j + 1] += (a[i][j] - 1) / 2;
                }
            }
        }
        return Math.min(1, a[query_row][query_glass]);
    }
}

// Code by Md Zaid Alam