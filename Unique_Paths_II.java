class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int[][] a = new int[g.length][g[0].length];
        for(int i = 0; i < a.length; i++){
            if(g[i][0] == 1)
                break;
            a[i][0] = 1;
        }
        for(int i = 0; i < a[0].length; i++){
            if(g[0][i] == 1)
                break;
            a[0][i] = 1;
        }
        
        for(int i = 1; i < a.length; i++){
            for(int j = 1; j < a[0].length; j++){
                if(g[i][j] == 1)
                    continue;
                a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }
        
        return a[a.length-1][a[0].length - 1];
    }
}

// Code by Md Zaid Alam