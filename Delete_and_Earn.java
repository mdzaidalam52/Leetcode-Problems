class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
        }
        int[] ind = new int[max+1];
        for(int i = 0; i < nums.length; i++){
            ind[nums[i]]++;
        }
        int[] dp = new int[max+1];
        dp[1] = ind[1];
        for(int i = 2; i <= max; i++){
            dp[i] = Math.max(dp[i-2] + i * ind[i], dp[i-1]);
        }
        return dp[max];
    }
}

// Code by Md Zaid Alam