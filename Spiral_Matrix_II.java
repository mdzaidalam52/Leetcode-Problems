class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int x = 1;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n-i; j++){
                ans[i][j] = x;
                x++;
            }
            for(int j = i+1; j < n-i; j++){
                ans[j][n-i-1] = x;
                x++;
            }
            for(int j = n-i-2; j >= i; j--){
                ans[n-i-1][j] = x;
                x++;
            }
            for(int j = n - i - 2; j > i; j--){
                ans[j][i] = x;
                x++;
            }
        }
        if(n%2 == 1)
            ans[n/2][n/2] = x;
        return ans;
    }
}

// Code by Md Zaid Alam