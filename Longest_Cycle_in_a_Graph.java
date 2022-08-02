class Solution {
    public int longestCycle(int[] edges) {
        int ans = -1;
        boolean[] vis = new boolean[edges.length], curr = new boolean[edges.length];
        int[] a = new int[edges.length];
        for(int i = 0; i < edges.length; i++){
            if(!vis[i])
                ans = Math.max(ans, solve(edges, i, vis, curr, a, 0));
        }
        return ans;
    }
    
    public int solve(int[] e, int ind, boolean[] vis, boolean[] current, int[] a, int count){
        if(current[ind]){
            current[ind] = false;
            return count - a[ind];
        }
        if(vis[ind])
            return -1;
        vis[ind] = true;
        current[ind] = true;
        a[ind] = count;
        if(e[ind] != -1){
            int ans = solve(e, e[ind], vis, current, a, count+1);
            current[ind] = false;
            a[ind] = 0;
            return ans;
        }else{
            a[ind] = 0;
            current[ind] = false;
            return -1;
        }
    }
}

// Code by Md Zaid Alam