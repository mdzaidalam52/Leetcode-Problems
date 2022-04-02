class Solution {
    public int partitionDisjoint(int[] nums) {
        int ind = 0;
        int k = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < k) {
                ind = i;
                k = Math.max(max, nums[i]);
            }
            max = Math.max(nums[i], max);
        }
        return ind + 1;
    }
}

// Code by Md Zaid Alam