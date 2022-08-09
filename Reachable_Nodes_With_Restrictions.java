class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: restricted){
            set.add(i);
        }
        int ans = 0;
        boolean[] vis = new boolean[n];
        vis[0] = true;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i = 0; i < n; i++){
            g.add(new ArrayList<>());
        }
        for(int[] a: edges){
            g.get(a[0]).add(a[1]);
            g.get(a[1]).add(a[0]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            ans++;
            int k = q.remove();
            for(int i: g.get(k)){
                if(vis[i] || set.contains(i))
                    continue;
                vis[i] = true;
                q.add(i);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam