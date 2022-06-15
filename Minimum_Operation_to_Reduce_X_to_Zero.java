class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int i: nums) 
            sum += i;

        int ans = -1, total = 0;
        for (int s = 0, e = 0; e < nums.length; e++) {
            total += nums[e];
            while (s <= e && total > sum - x) 
                total -= nums[s++];
            if (total == sum - x) 
                ans = Math.max(ans, e - s + 1);
        }

        return ans == -1 ? -1 : nums.length - ans;
    }
}

// Code by Md Zaid Alam