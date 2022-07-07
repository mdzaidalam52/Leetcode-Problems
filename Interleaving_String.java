class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() != s1.length() + s2.length())
            return false;
        boolean[][] a = new boolean[s1.length()+1][s2.length()+1];
        return solve(s1, s2, s3, 0, 0, 0, a);
    }
    
    boolean solve(String a, String b, String c, int i, int j, int k, boolean[][] vis){
        if(c.length() == k){
            return true;
        }
        if(vis[i][j]){
            return false;
        }
        vis[i][j] = true;
        if(a.length() == i){
            if(c.charAt(k) != b.charAt(j))
                return false;
            else
                return solve(a, b, c, i, j+1, k+1, vis);
        }else if(b.length() == j){
            if(c.charAt(k) != a.charAt(i))
                return false;
            else
                return solve(a, b, c, i+1, j, k+1, vis);
        }else if(a.charAt(i) == c.charAt(k)){
            if(solve(a, b, c, i+1, j, k+1, vis)){
                return true;
            }else if(b.charAt(j) == c.charAt(k)){
                return solve(a, b, c, i, j+1, k+1, vis);
            }else{
                return false;
            }
        }else if(b.charAt(j) == c.charAt(k)){
            return solve(a, b, c, i, j+1, k+1, vis);
        }else{
            return false;
        }
    }
}

// Code by Md Zaid Alam