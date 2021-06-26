class Solution {
    public int numSquares(int n) {
        if (n == 1)
			return 1;

		int[] a = new int[(int) Math.floor(Math.sqrt(n))];

		for (int i = 0; i < a.length; i++) {
			a[i] = (i + 1) * (i + 1);
		}

		int[] ans = new int[n + 1];
		Arrays.fill(ans, -1);
		ans[0] = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < a.length && i >= a[j]; j++) {
				ans[i] = (ans[i] == -1) ? (ans[i - a[j]] + 1) : Math.min(ans[i - a[j]] + 1, ans[i]);

			}
		}
		return ans[n];
    }
    
    
    
}

// Code by Md Zaid Alam