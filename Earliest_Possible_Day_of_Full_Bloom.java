class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = plantTime[i];
            a[i][1] = growTime[i];
        }
        Arrays.sort(a, (b, c) -> c[1] - b[1]);
        int ans = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, prev + a[i][0] + a[i][1]);
            prev += a[i][0];
        }
        return ans;
    }
}

// Code by Md Zaid Alam