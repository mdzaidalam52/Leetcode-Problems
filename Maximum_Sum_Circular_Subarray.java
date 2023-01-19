class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0, maxSum = Integer.MIN_VALUE, curMax = 0, minSum = Integer.MAX_VALUE, curMin = 0;
        for (int x : nums) {
            curMax = Math.max(x, curMax + x);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(x, curMin + x);
            minSum = Math.min(minSum, curMin);
            totalSum += x;
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}

// Code by Md Zaid Alam