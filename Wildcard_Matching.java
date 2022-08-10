class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[][] a = new boolean[n+1][m+1];
        return solve(s, p, 0, 0, a);
    }
    
    boolean solve(String s, String p, int i, int j, boolean[][] a){
        if(i == s.length() && j == p.length())
            return true;
        if(a[i][j])
            return false;
        a[i][j] = true;
        if(i == s.length()){
            while(j < p.length() && p.charAt(j) == '*')
                j++;
            return j == p.length();
        }
        if(j == p.length())
            return false;
        if(p.charAt(j) == '?'){
            return solve(s, p, i+1, j+1, a);
        }
        if(p.charAt(j) == '*')
            return solve(s, p, i, j+1, a) || solve(s, p, i+1, j, a);
        if(p.charAt(j) == s.charAt(i))
            return solve(s, p, i+1, j+1, a);
        return false;
    }
}

// Code by Md Zaid Alam