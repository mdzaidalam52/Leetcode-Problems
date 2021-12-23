class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>(numCourses);
        
        for(int i = 0; i < numCourses; i++){
            g.add(new ArrayList<>());
        }
        for(int[] a : prerequisites){
            g.get(a[0]).add(a[1]);
        }
        boolean[] vis = new boolean[numCourses];
        boolean[] dfsvis = new boolean[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            if(isCycle(g, i, vis, dfsvis))
                return false;
        }
        return true;
    }
    
    boolean isCycle(ArrayList<ArrayList<Integer>> g, int a, boolean[] vis, boolean[] dfs){
        if(dfs[a])
            return true;
        if(vis[a])
            return false;
        
        vis[a] = true;
        dfs[a] = true;
        
        for(int i: g.get(a)){
            if(isCycle(g, i, vis, dfs))
                return true;
        }
        dfs[a] = false;
        return false;
    }
}

// Code by Md Zaid Alam