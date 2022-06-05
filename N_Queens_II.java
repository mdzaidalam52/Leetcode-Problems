class Solution {
    public int totalNQueens(int n) {
        char[][] a = new char[n][n];
        for(char[] c: a){
            Arrays.fill(c, '.');
        }
        return solve(a, 0);
    }
    
    int solve(char[][] a, int ind){
        if(ind == a.length){
            return 1;
        }
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            if(check(a, ind, i)){
                a[ind][i] = 'Q';
                ans += solve(a, ind+1);
                a[ind][i] = '.';
            }
        }
        return ans;
    }
    
    boolean check(char[][] a, int y, int x){
        for(int i = 0; i < a.length; i++)
            if(a[y][i] == 'Q' || a[i][x] == 'Q')
                return false;
        
        for(int i = 1; i + x < a.length && i+ y < a.length; i++)
            if(a[y+i][x+i] == 'Q')
                return false;
        
        for(int i = 1; x-i >= 0 && y-i >= 0; i++)
            if(a[y-i][x-i] == 'Q')
                return false;
        
        for(int i = 1; i + x < a.length && y-i >= 0; i++)
            if(a[y-i][x+i] == 'Q')
                return false;
        
        for(int i = 1; x-i >= 0 && i+ y < a.length; i++)
            if(a[y+i][x-i] == 'Q')
                return false;
        
        
        return true;
    }
}

// Code by Md Zaid Alam