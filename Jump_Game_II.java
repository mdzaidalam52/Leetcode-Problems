class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 1; j <= nums[i] && j + i < nums.length; j++){
                dp[i+j] = Math.min(dp[i+j], dp[i]+1);
            }
        }
        
        return dp[nums.length-1];
    }
}

// Code by Md Zaid Alam
