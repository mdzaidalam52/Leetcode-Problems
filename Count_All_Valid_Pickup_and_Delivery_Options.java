class Solution {
    public int countOrders(int n) {
        long ans = 1, mod = 1000000007;
        for (int i = 2 * n; i > 0; i -= 2) {
            ans = ((ans % mod) * (i % mod) * ((i - 1) % mod) / 2) % mod;
        }
        return (int) ans;
    }
}

// Code by Md Zaid Alam