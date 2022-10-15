class Solution {
    public int minimizeArrayValue(int[] nums) {
        int s = Integer.MAX_VALUE, e = Integer.MIN_VALUE;
        for (int i : nums) {
            s = Math.min(s, i);
            e = Math.max(e, i);
        }
        int ans = e;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (check(nums, mid)) {
                ans = Math.min(ans, mid);
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    boolean check(int[] a, int k) {
        long c = 0;
        for (int i = a.length - 1; i > 0; i--) {
            long l = a[i] + c;
            c = Math.max(l - k, 0);
        }
        return (a[0] + c) <= k;
    }
}

// Code by Md Zaid Alam