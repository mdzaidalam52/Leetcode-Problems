class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] a = new int[n][m];
        for(int[] arr: a){
            Arrays.fill(arr, -1);
        }
        return solve(a, word1, word2, 0, 0);
    }
    
    int solve(int[][] a, String s, String t, int i, int j){
        if(i == s.length() && j == t.length()){
            return 0;
        }
        if(i == s.length() || j == t.length()){
            return t.length() - j + s.length() - i;
        }
        if(a[i][j] != -1)
            return a[i][j];
        if(s.charAt(i) == t.charAt(j)){
            a[i][j] = solve(a, s, t, i+1, j+1);
        }else{
            a[i][j] = Math.min(solve(a, s, t, i+1, j) + 1, solve(a, s, t, i+1, j+1) + 1);
            a[i][j] = Math.min(solve(a, s, t, i, j+1) + 1, a[i][j]);
        }
        return a[i][j];
    }
}

// Code by Md Zaid Alam