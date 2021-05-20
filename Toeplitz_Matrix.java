class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            if(!check(matrix, i, 0)) return false;
        }
        
        for(int j = 1; j < matrix[0].length; j++)
            if(!check(matrix, 0, j)) return false;
        
        return true;
    }
    
    boolean check(int[][] matrix, int i, int j){
        int a = matrix[i][j];
        while(i < matrix.length && j < matrix[0].length){
            if(matrix[i][j] != a) return false;
            i++;
            j++;
        }
        return true;
    }
}

// Code by Md Zaid Alam