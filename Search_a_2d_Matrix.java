class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0;
        while(i < m && matrix[i][n-1] < target){
            i++;
        }
        if(i == m)
            return false;
        int j = n;
        while(j-- > 0){
            if(matrix[i][j] == target)
                return true;
        }
        return false;
    }
}

// Code by Md Zaid Alam