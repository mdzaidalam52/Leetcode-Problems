class Solution {
    public void rotate(int[][] a) {
        int n = a.length;
        int t;
        for(int i = 0; i < (n%2 == 0 ? n/2 : n/2+1); i++){
            for(int j = 0; j < n/2; j++){
                t = a[i][j];
                a[i][j] = a[n-1-j][i];
                a[n-1-j][i] = a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i] = t;
            }
        }
        
    }
}

// Code by Md Zaid Alam