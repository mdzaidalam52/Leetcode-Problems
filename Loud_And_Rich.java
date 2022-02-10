class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        List<List<Integer>> g = new ArrayList<>();
        int n = quiet.length;
        if(n == 1){
            return new int[]{0};
        }
        for(int i = 0; i < n; i++){
            g.add(new ArrayList<>());
        }
        for(int[] a: richer){
            g.get(a[1]).add(a[0]);
        }
        
        boolean[] vis = new boolean[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            solve(g, i, vis, ans, quiet);
        }
        return ans;
        
    }
    
    int solve(List<List<Integer>> g, int ind, boolean[] vis, int[] ans, int[] q){
        if(vis[ind])
            return ans[ind];
        vis[ind] = true;
        int max = ind;
        for(int i: g.get(ind)){
            int k = solve(g, i, vis, ans, q);
            if(q[k] < q[max])
                max = k;
        }
        ans[ind] = max;
        return max;
    }
}

// Code by Md Zaid Alam