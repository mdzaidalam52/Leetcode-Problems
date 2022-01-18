class Solution {
    public boolean canPartition(int[] nums) {
        int sum = possible(nums);
        if((sum & 1) != 0)
            return false;
        boolean[][] dp = new boolean[nums.length+1][sum/2+1];
        for(int i = 1; i <= nums.length; i++){
            for(int j = 0; j <= sum/2; j++){
                if(j == 0)
                    dp[i][j] = true;
                else if(j >= nums[i-1])
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[nums.length][sum/2];
    }
    
    int possible(int[] a){
        int sum = 0;
        for(int i: a)
            sum += i;
        return sum;
    }
}

// Code by Md Zaid Alam