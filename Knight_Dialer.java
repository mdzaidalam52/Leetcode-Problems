class Solution {
    public int knightDialer(int n) {
        long[][] ans = new long[n + 1][10];
        int[][] moves = new int[10][];
        moves[0] = new int[] { 4, 6 };
        moves[1] = new int[] { 6, 8 };
        moves[2] = new int[] { 7, 9 };
        moves[3] = new int[] { 4, 8 };
        moves[4] = new int[] { 0, 3, 9 };
        moves[5] = new int[] {};
        moves[6] = new int[] { 0, 1, 7 };
        moves[7] = new int[] { 2, 6 };
        moves[8] = new int[] { 1, 3 };
        moves[9] = new int[] { 2, 4 };
        int mod = 1000000007;
        Arrays.fill(ans[1], 1);
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5)
                    continue;
                for (int a : moves[j]) {
                    ans[i][j] = (ans[i][j] + ans[i - 1][a]) % mod;
                }
            }
        }
        long nums = 0;
        for (long i : ans[n])
            nums = (nums + i) % mod;
        return (int) nums;
    }
}

// Code by Md Zaid Alam