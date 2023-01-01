class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        return solve(arr, source, destination, new boolean[n]);
    }

    boolean solve(ArrayList<ArrayList<Integer>> arr, int ind, int k, boolean[] vis){
        if(ind == k)
            return true;

        if(vis[ind])
            return false;
        vis[ind] = true;
        for(int i: arr.get(ind)){
            if(solve(arr, i, k, vis)){
                return true;
            }
        }
        return false;
    }
}

// Code by Md Zaid Alam