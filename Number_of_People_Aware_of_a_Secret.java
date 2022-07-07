class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        Queue<Long> u = new LinkedList<>(), f = new LinkedList<>(), ut = new LinkedList<>(), ft = new LinkedList<>();
        long ans = 1;
        final long mod = 1000000007;
        long curr = 0;
        u.add((long) 1);
        ut.add((long) delay + 1);
        for (int i = 1; i <= n; i++) {
            if (ft.size() > 0 && i == ft.peek()) {
                curr = (curr + mod - f.peek()) % mod;
                ans = (ans + mod - f.remove()) % mod;
                ft.remove();
            }
            if (ut.size() > 0 && i == ut.peek()) {
                ft.add(ut.remove() + forget - delay);
                curr = (curr + u.peek()) % mod;
                f.add(u.remove());
            }
            ans = (ans + curr) % mod;
            if (curr > 0) {
                u.add(curr);
                ut.add((long) (i + delay));
            }
        }
        return (int) ans;
    }
}

// Code by Md Zaid Alam