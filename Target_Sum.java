class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length, sum = 0;
        for(int i: nums)
            sum += i;
        if((sum-target) % 2 == 0 && sum - target >= 0){
            target = (sum-target)/2;
        }else{
            return 0;
        }
        
        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= target; j++){
                if(j >= nums[i-1]){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}

// Code by Md Zaid Alam