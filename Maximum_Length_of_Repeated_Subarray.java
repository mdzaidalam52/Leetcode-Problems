class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[][] dp = new int[n][m];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[j] == nums2[i]) {
                    if (j > 0 && i > 0) {
                        dp[j][i] = Math.max(dp[j - 1][i - 1] + 1, dp[j][i]);
                    } else {
                        dp[j][i] = 1;
                    }
                    ans = Math.max(dp[j][i], ans);
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam