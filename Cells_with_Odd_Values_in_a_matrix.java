class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] a = new int[m][n];
        for(int i = 0; i < indices.length; i++){
            increment(a, indices[i][0], indices[i][1]);
        }
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] % 2 == 1)
                    ans++;
            }
        }
        return ans;
    }
    
    public void increment(int[][] a, int i, int j){
        for(int x = 0; x < a[0].length; x++)
            a[i][x]++;
        
        for(int x = 0; x < a.length; x++)
            a[x][j]++;
        
    }
}

// Code by Md Zaid Alam