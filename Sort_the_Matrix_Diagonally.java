class Solution {
    public int[][] diagonalSort(int[][] mat) {
        if(mat.length == 1 || mat[0].length == 1){
            return mat;
        }
        int n = mat.length, m = mat[0].length;
        
        for(int i = 0; i < m; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j < n && i+j < m; j++){
                arr.add(mat[j][j+i]);
            }
            Collections.sort(arr);
            for(int j = 0; j < n && i+j < m; j++){
                mat[j][j+i] = arr.get(j);
            }
        }
        
        for(int i = 1; i < n; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j < m && j+i < n; j++){
                arr.add(mat[i+j][j]);
            }
            Collections.sort(arr);
            for(int j = 0; j < m && j+i < n; j++){
                mat[i+j][j] = arr.get(j);
            }
        }
        return mat;
    }
}

// Code by Md Zaid Alam