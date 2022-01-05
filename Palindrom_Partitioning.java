class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
            if(i < n-1 && s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
            }
        }
        
        for(int i = 2; i < n; i++){
            for(int j = 0; j + i < n; j++){
                dp[j][i+j] = dp[j+1][j+i-1] && (s.charAt(j) == s.charAt(j+i));
            }
        }
        
        solve(dp, s, 0, ans, new ArrayList<>());
        return ans;
    }
    
    void solve(boolean[][] dp, String s, int ind, List<List<String>> ans, List<String> curr){
        if(ind == s.length()){
            List<String> l = new ArrayList<>();
            l.addAll(curr);
            ans.add(l);
            return;
        }
        
        for(int i = ind; i < s.length(); i++){
            if(dp[ind][i]){
                curr.add(s.substring(ind, i+1));
                solve(dp, s, i+1, ans, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}

// Code by Md Zaid Alam