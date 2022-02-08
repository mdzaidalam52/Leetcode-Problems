class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> l = new ArrayList<>();
        if(n == 1){
            l.add(0);
            return l;
        }
        
        int[] deg = new int[n];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(new ArrayList<>());
        
        for(int[] a: edges){
            arr.get(a[0]).add(a[1]);
            arr.get(a[1]).add(a[0]);
            deg[a[0]]++;
            deg[a[1]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++)
            if(deg[i] == 1)
                q.add(i);
        
        while(n > 2){
            int size = q.size();
            n -= size;
            while(size-- > 0){
                int k = q.remove();
                for(int i: arr.get(k)){
                    deg[i]--;
                    if(deg[i] == 1){
                        q.add(i);
                    }
                }
            }
        }
        l.addAll(q);
        return l;
    }
}

// Code by Md Zaid Alam