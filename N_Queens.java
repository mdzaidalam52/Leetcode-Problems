class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] a = new char[n][n];
        for(char[] c: a){
            Arrays.fill(c, '.');
        }
        List<List<String>> ans = new ArrayList<>();
        solve(a, 0, ans);
        return ans;
    }
    
    void solve(char[][] a, int ind, List<List<String>> ans){
        if(ind == a.length){
            ans.add(new ArrayList<>());
            for(char[] c: a){
                ans.get(ans.size()-1).add(new String(c));
            }
            return;
        }
        for(int i = 0; i < a.length; i++){
            if(check(a, ind, i)){
                a[ind][i] = 'Q';
                solve(a, ind+1, ans);
                a[ind][i] = '.';
            }
        }
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