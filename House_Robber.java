class Solution {
    public int rob(int[] nums) {
        int[] ans = new int[nums.length + 1];
        ans[1] = nums[0];
        for(int i = 2; i < ans.length; i++){
            ans[i] = Math.max(ans[i-1], ans[i-2] + nums[i-1]);
        }
        return ans[nums.length];
    }
}

// Code by Md Zaid Alam