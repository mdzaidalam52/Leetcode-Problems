class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i > 0 && i < n - 1)
				dp[i][i] = nums[i] * nums[i - 1] * nums[i + 1];
			else if (i > 0)
				dp[i][i] = nums[i] * nums[i - 1];
			else
				dp[i][i] = nums[i] * nums[i + 1];
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j + i < n; j++) {
				for (int k = j; k <= j + i; k++) {
					int p = 0;
					p += (k > j) ? dp[j][k-1] : 0;
					p += (k < i+j) ? dp[k+1][i+j] : 0;
					int q = (j > 0) ? nums[j-1] : 1;
					q *= (i+j < n-1) ? nums[i+j+1] : 1;
					dp[j][i + j] = Math.max(dp[j][j + i], q*nums[k] + p);
				}
			}
		}
		
		return dp[0][n-1];
    }
}

// Code by Md Zaid Alam