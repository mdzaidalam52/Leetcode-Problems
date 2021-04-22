class Solution {
    public boolean isSubsequence(String s, String t) {
        return check(t, s, 0, 0);
    }
    
    boolean check(String s, String t, int m, int n){
        if(n == t.length())
            return true;
        if(m == s.length())
            return false;
        if(s.charAt(m) == t.charAt(n)){
            return check(s, t, m+1, n+1);
        }
        return check(s, t, m+1, n);
    }
}

// Code by Md Zaid Alam