class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1])
                count++;
            else
                count = 1;
            ans = Math.max(ans, count);            
        }
        return ans;
    }
}

// Code by Md Zaid Alam