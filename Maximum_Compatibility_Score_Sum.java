class Solution {
    int ans = 0;

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        boolean[] vis = new boolean[students.length];
        for (int i = 0; i < students.length; i++) {
            vis[i] = true;
            solve(compatibility(students[0], mentors[i]), students, mentors, vis, 1);
            vis[i] = false;
        }
        return ans;
    }

    void solve(int score, int[][] a, int[][] b, boolean[] vis, int ind) {
        ans = Math.max(ans, score);
        if (ind == a.length)
            return;
        for (int i = 0; i < vis.length; i++) {
            if (vis[i])
                continue;
            vis[i] = true;
            solve(score + compatibility(a[ind], b[i]), a, b, vis, ind + 1);
            vis[i] = false;
        }
    }

    int compatibility(int[] a, int[] b) {
        int ans = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == b[i])
                ans++;
        return ans;
    }
}

// Code by Md Zaid Alam