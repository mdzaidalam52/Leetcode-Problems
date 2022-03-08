class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            ans++;
        }
        for (int j = 0; j < n - 1; j++) {
            if (s.charAt(j) == s.charAt(j + 1)) {
                dp[j][j + 1] = true;
                ans++;
            }
        }

        for (int i = 2; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                if (s.charAt(j) == s.charAt(j + i) && dp[j + 1][j + i - 1]) {
                    dp[j][i + j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam