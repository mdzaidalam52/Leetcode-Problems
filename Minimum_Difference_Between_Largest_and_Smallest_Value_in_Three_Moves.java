class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 4)
            return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Math.min(nums[n-2] - nums[2], nums[n-3] - nums[1]);
        ans = Math.min(nums[n-4] - nums[0], ans);
        ans = Math.min(nums[n-1] - nums[3], ans);
        return ans;
    }
}


// Code by Md Zaid Alam