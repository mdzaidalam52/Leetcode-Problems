class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        if(graph == null || graph.length == 0)
            return ans;
        int n = graph.length;
        int[] vis = new int[n];
        for(int i = 0; i < n; i++){
            if(dfs(graph, i, vis)){
                ans.add(i);
            }
        }
        return ans;
    }
    
    boolean dfs(int[][] g, int ind, int[] vis){
        if(vis[ind] != 0)
            return vis[ind] == 1;
        vis[ind] = 2;
        for(int a : g[ind]){
            if(!dfs(g, a, vis))
                return false;
        }
        vis[ind] = 1;
        return true;
    }
}

// Code by Md Zaid Alam