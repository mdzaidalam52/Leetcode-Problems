class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, ans = 0;
        for(int i = 0; i < n; i++){
            ans += mat[i][i] + mat[i][n-1-i];
        }
        if((n&1) != 0){
            ans -= mat[n>>1][n>>1];
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam