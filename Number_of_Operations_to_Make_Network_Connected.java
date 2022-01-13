class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }
        for(int i = 0; i < connections.length; i++){
            arr.get(connections[i][0]).add(connections[i][1]);
            arr.get(connections[i][1]).add(connections[i][0]);
        }
        int ans = -1;
        boolean[] vis = new boolean[n];
        for(int i = 0; i < n; i++){
            if(vis[i]){
                continue;
            }
            ans++;
            dfs(arr, i, vis);
        }
        return ans;
    }
    void dfs(ArrayList<ArrayList<Integer>> g, int ind, boolean[] vis){
        if(vis[ind])
            return;
        vis[ind] = true;
        for(int i: g.get(ind)){
            dfs(g, i, vis);
        }
    }
}

// Code by Md Zaid Alam