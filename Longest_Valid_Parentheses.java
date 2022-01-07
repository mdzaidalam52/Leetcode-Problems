class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
		if (n == 0)
			return 0;
		int[] dp = new int[n];
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == ')') {
				if (s.charAt(i-1) == '(') {
					dp[i] = i >= 2 ? dp[i - 2] + 2 : 2;
				} else {
					int k = dp[i - 1];
					if (i - 1 - dp[i - 1] == 0 && s.charAt(i - 1 - dp[i - 1]) == '(') {
						k += dp[i - 1 - dp[i - 1]] + 2;
						dp[i] = k;
					}else if(i - 1 - dp[i - 1] > 0 && s.charAt(i - 1 - dp[i - 1]) == '(') {
						k += dp[i - 2 - dp[i - 1]] + 2;
						dp[i] = k;
					}

				}
			}
		}
		int max = 0;
		for (int a : dp) {
			max = Math.max(a, max);
		}
		return max;
    }
}

// Code by Md Zaid Alam