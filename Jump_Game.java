class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 0; i < nums.length-1; i++){
            if(dp[i] == false)
                continue;
            for(int j = 1; j <= nums[i] && j + i < nums.length; j++){
                dp[i+j] = true;
            }
        }
        
        return dp[nums.length-1];
    }
}

// Code by Md Zaid Alam