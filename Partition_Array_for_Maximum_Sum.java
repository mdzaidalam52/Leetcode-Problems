class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            int d = arr[i-1] + dp[i-1];
            int l = arr[i-1];
            for(int j = 1; j < k && i - 1 - j >= 0; j++){
                l = Math.max(arr[i-j-1], l);
                d = Math.max(l*(j+1) + dp[i-j-1], d);
            }
            dp[i] = d;
        }
        
        
        return dp[n];
    }
}

// Code by Md Zaid Alam