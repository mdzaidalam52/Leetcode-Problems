class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = (nums[i] + nums[i + 1]) % 10;
        }
        return triangularSum(a);
    }
}

// Code by Md Zaid Alam