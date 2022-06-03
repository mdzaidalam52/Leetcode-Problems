class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if(r*c != m*n)
            return mat;
        int[][] ans = new int[r][c];
        for(int i = 0; i < m*n; i++){
            ans[i/c][i%c] = mat[i/m][i%m];
        }
        return ans;
    }
}

// Code by Md Zaid Alam