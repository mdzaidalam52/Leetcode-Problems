class Solution {
    public int numDistinct(String s, String t) {
        int[][] a = new int[s.length()][t.length()];
        for(int[] i: a)
            Arrays.fill(i, -1);
        return solve(a, s, t, 0, 0);
    }
    int solve(int[][] a, String s, String t, int i, int j){
        if(s.length() - i < t.length() - j)
            return 0;
        if(j == t.length())
            return 1;
        if(a[i][j] != -1)
            return a[i][j];
        a[i][j] = solve(a, s, t, i+1, j);
        if(s.charAt(i) == t.charAt(j)){
            a[i][j] += solve(a, s, t, i+1, j+1);
        }
        return a[i][j];
    }
}

// Code by Md Zaid Alam