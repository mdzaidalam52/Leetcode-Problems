class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        long max[] = new long[n + 1], min[] = new long[n + 1];
        max[1] = nums[0];
        min[1] = nums[0];
        long ans = nums[0];
        for (int i = 1; i < n; i++) {
            max[i + 1] = Math.max(max[i] * nums[i], min[i] * nums[i]);
            max[i + 1] = Math.max(max[i + 1], nums[i]);
            min[i + 1] = Math.min(max[i] * nums[i], min[i] * nums[i]);
            min[i + 1] = Math.min(min[i + 1], nums[i]);
            ans = Math.max(max[i + 1], ans);
        }
        return (int) ans;
    }
}

// Code by Md Zaid Alam