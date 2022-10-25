class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int gcd = nums[i];
            for (int j = i; j < nums.length; j++) {
                int g = gcd(Math.max(nums[j], gcd), Math.min(nums[j], gcd));
                if (nums[j] % k != 0 || g % k != 0) {
                    break;
                }
                gcd = g;
                if (g == k) {
                    ans++;
                }
            }
        }
        return ans;
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

// Code by Md Zaid Alam