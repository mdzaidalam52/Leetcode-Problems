class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int n = queries.length;
        long[] ans = new long[n];
        int m = intLength / 2 + intLength % 2;
        int l = 1;
        for (int i = 1; i < m; i++) {
            l *= 10;
        }
        int limit = 9 * l;
        for (int i = 0; i < n; i++) {
            if (queries[i] > limit) {
                ans[i] = -1;
            } else {
                ans[i] = find(l + queries[i] - 1, intLength % 2 == 1);
            }
        }
        return ans;
    }

    long find(long a, boolean odd) {
        long ans = a;
        if (odd) {
            a /= 10;
        }
        while (a != 0) {
            ans *= 10;
            ans += a % 10;
            a /= 10;
        }
        return ans;
    }
}

// Code by Md Zaid Alam