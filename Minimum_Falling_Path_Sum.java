class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix[0].length;
        int m = Integer.MAX_VALUE;
        
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j < n; j++){
                matrix[i][j] += Math.min(matrix[i+1][j], Math.min(j > 0 ? matrix[i+1][j - 1] : m, j < n-1 ? matrix[i+1][j + 1] : m));
            }
        }
        
        for(int i : matrix[0])
        	m = Math.min(i, m);
        
        return m;
    }
}

// Code by Md Zaid Alam