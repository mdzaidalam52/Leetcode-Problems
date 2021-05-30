class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target, 0, matrix[0].length - 1);
    }
    
    public boolean search(int[][] a, int k, int i, int j){
        if(i == a.length || j == -1){
            return false;
        }
        if(a[i][j] == k)
            return true;
        
        if(a[i][j] > k){
            return search(a, k, i, j - 1);
        }else{
            return search(a, k, i + 1, j);
        }
    }
}

// Code by Md Zaid Alam