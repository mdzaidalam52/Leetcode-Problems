class Solution {
    public int minPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            ans = Math.max(nums[i] + nums[nums.length - 1 - i], ans);
        }
        return ans;
    }
}

// Code by Md Zaid Alam