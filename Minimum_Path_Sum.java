class Solution {
    public int minPathSum(int[][] g) {
        int[][] a = new int[g.length][g[0].length];
        a[0][0] = g[0][0];
        for(int i = 1; i < a.length; i++){
            a[i][0] = a[i-1][0] + g[i][0];
        }
        
        for(int i = 1; i < a[0].length; i++){
            a[0][i] = a[0][i-1] + g[0][i];
        }
        
        for(int i = 1; i < a.length; i++){
            for(int j = 1; j < a[0].length; j++){
                a[i][j] = Math.min(a[i-1][j], a[i][j-1]) + g[i][j];
            }
        }
        
        return a[a.length - 1][a[0].length-1];
    }
}

// Code by Md Zaid Alam