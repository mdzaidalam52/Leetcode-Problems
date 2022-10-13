class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int[] a = new int[n];
        int prev = 0;
        int ans = 0, max = 0;
        for (int i = 0; i < logs.length; i++) {
            a[logs[i][0]] = Math.max(a[logs[i][0]], logs[i][1] - prev);
            prev = logs[i][1];
            if (max < a[logs[i][0]]) {
                max = a[logs[i][0]];
                ans = logs[i][0];
            } else if (max == a[logs[i][0]]) {
                ans = Math.min(ans, logs[i][0]);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam