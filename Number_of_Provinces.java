class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, ans = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i])
                continue;
            ans++;
            for (int j = 0; j < n; j++)
                if (isConnected[i][j] == 1)
                    dfs(isConnected, vis, i);
        }
        return ans;
    }

    static void dfs(int[][] g, boolean[] vis, int ind) {
        if (vis[ind]) {
            return;
        }
        vis[ind] = true;
        for (int i = 0; i < g.length; i++) {
            if (!vis[i] && g[ind][i] == 1) {
                dfs(g, vis, i);
            }
        }
    }
}

// Code by Md Zaid Alam