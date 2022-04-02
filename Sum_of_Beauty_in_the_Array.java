class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] l = new int[n], r = new int[n];
        l[0] = nums[0];
        r[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            l[i] = Math.max(l[i - 1], nums[i]);
            r[n - i - 1] = Math.min(r[n - i], nums[n - i - 1]);
        }
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (l[i - 1] < nums[i] && nums[i] < r[i + 1]) {
                ans += 2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                ans++;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam