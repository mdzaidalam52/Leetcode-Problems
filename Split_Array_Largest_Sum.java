class Solution {
    public int splitArray(int[] nums, int m) {
        int s = Integer.MIN_VALUE, e = 0;
        for (int i : nums) {
            s = Math.max(i, s);
            e += i;
        }
        int ans = e;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (check(nums, mid, m)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    boolean check(int[] a, int val, int m) {
        int s = 0;
        for (int i : a) {
            if (s + i <= val) {
                s += i;
            } else {
                s = i;
                m--;
            }
        }
        m--;
        return m >= 0;

    }
}

// Code by Md Zaid Alam