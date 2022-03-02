class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int ans = 0;
        int n = nums.length;
        int current = 0;
        for (int i = 0; i < firstLen; i++) {
            current += nums[i];
        }
        ans = current + check(nums, 0, firstLen - 1, secondLen);
        for (int i = firstLen; i < n; i++) {
            current += nums[i] - nums[i - firstLen];
            ans = Math.max(current + check(nums, i - firstLen + 1, i, secondLen), ans);
        }
        return ans;
    }

    int check(int[] a, int s, int e, int l) {
        int ans = Integer.MIN_VALUE, n = a.length;
        int current = 0;
        if (s >= l) {
            for (int i = 0; i < l; i++) {
                current += a[i];
            }
            ans = Math.max(ans, current);
            for (int i = l; i < s; i++) {
                current += a[i] - a[i - l];
                ans = Math.max(ans, current);
            }
        }

        if (l + e < a.length) {
            current = 0;
            for (int i = 0; i < l; i++) {
                current += a[i + e + 1];
            }
            ans = Math.max(ans, current);
            for (int i = e + l + 1; i < n; i++) {
                current += a[i] - a[i - l];
                ans = Math.max(current, ans);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam