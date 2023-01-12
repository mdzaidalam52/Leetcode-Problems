class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] a : edges) {
            g.get(a[0]).add(a[1]);
            g.get(a[1]).add(a[0]);
        }

        int ans = 0;
        boolean[] vis = new boolean[n];
        return solve(g, hasApple, 0, vis);
    }

    int solve(ArrayList<ArrayList<Integer>> g, List<Boolean> hasApple, int ind, boolean[] vis) {
        if (vis[ind]) {
            return 0;
        }
        vis[ind] = true;
        int ans = 0, count = 0;
        for (int i : g.get(ind)) {
            ans += solve(g, hasApple, i, vis);
        }
        if (ans != 0 || hasApple.get(ind)) {
            return ans + (ind != 0 ? 2 : 0);
        }
        return 0;
    }
}

// Code by Md Zaid Alam