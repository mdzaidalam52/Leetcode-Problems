class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i = 0; i < n; i++){
            g.add(new ArrayList<>());
        }
        int[] ans = new int[n];
        for(int[] i: paths){
            g.get(i[1]-1).add(i[0]-1);
            g.get(i[0]-1).add(i[1]-1);
        }
        
        for(int i = 0; i < n; i++){
            dfs(g, i, ans);
        }
        return ans;
    }
    
    void dfs(ArrayList<ArrayList<Integer>> g, int ind, int[] ans){
        if(ans[ind] > 0)
            return;
        int color = 0;
        for(int i = 1; i < 5; i++){
            boolean bool = true;
            for(int a: g.get(ind)){
                if(ans[a] == i){
                    bool = false;
                    break;
                }
            }
            if(bool){
                color = i;
                break;
            }
        }
        ans[ind] = color;
        for(int i : g.get(ind)){
            dfs(g, i, ans);
        }
    }
}

// Code by Md Zaid Alam