class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            g.add(new ArrayList<>());
        }
        for(int[] a: prerequisites){
            g.get(a[0]).add(a[1]);
        }
        
        boolean[] vis = new boolean[numCourses];
        boolean[] dfs = new boolean[numCourses];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < numCourses; i++){
            if(topo(g, i, vis, dfs, st)){
                return new int[0];
            }
        }
        int[] ans = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            ans[i] = st.pop();
        }
        for(int i = 0; i < numCourses/2; i++){
            int t = ans[i];
            ans[i] = ans[numCourses - i - 1];
            ans[numCourses-i-1] = t;
        }
        return ans;
    }
    
    
    boolean topo(ArrayList<ArrayList<Integer>> g, int a, boolean[] vis, boolean[] dfs, Stack<Integer> st){
        if(dfs[a])
            return true;
        if(vis[a])
            return false;
        
        dfs[a] = true;
        vis[a] = true;
        
        for(int i : g.get(a))
            if(topo(g, i, vis, dfs, st))
                return true;
        st.push(a);
        dfs[a] = false;
        return false;
    }
}

// Code by Md Zaid Alam