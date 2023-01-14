class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] ans = new int[n];
        boolean[] vis = new boolean[n];
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] a : edges) {
            g.get(a[0]).add(a[1]);
            g.get(a[1]).add(a[0]);
        }

        solve(g, labels, 0, ans, vis);

        return ans;
    }

    public int[] solve(ArrayList<ArrayList<Integer>> g, String labels, int ind, int[] ans, boolean[] vis) {
        if (vis[ind]) {
            return new int[26];
        }
        vis[ind] = true;
        int[] a = new int[26];
        for (int i : g.get(ind)) {
            int[] b = solve(g, labels, i, ans, vis);
            for (int j = 0; j < 26; j++) {
                a[j] += b[j];
            }
        }
        ans[ind] = ++a[labels.charAt(ind) - 'a'];
        return a;
    }
}

// Code by Md Zaid Alam