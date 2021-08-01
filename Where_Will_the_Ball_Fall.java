class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(n == 1){
            int[] ans = new int[n];
            ans[0] = -1;
            return ans;
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
        	ans[i] = i;
        }
        for(int i = m - 1; i >= 0; i--){
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                if(grid[i][j] == -1 && (j == 0 || grid[i][j-1] == 1)){
                    a[j] = -1;
                }else if(grid[i][j] == 1 && (j == n-1 || grid[i][j+1] == -1)){
                    a[j] = -1;
                }else if(grid[i][j] == 1){
                    a[j] = ans[j+1];
                }else{
                    a[j] = ans[j-1];
                }
            }
            ans = a;
        }
        return ans;
    }
}

// Code by Md Zaid Alam