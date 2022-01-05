class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        boolean[] in = new boolean[n];
        for(int i = 0; i < edges.size(); i++){
            in[edges.get(i).get(1)] = true;
        }
        for(int i = 0; i < n; i++){
            if(!in[i]) ans.add(i);
        }
        return ans;
    }
}

// Code by Md Zaid Alam