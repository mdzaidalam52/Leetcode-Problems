class Solution {
    int ans = 0;
    public int maximumRows(int[][] mat, int cols) {
        HashSet<Integer> set = new HashSet<>();
        int m = mat[0].length;
        for(int i = 0; i < m-cols+1; i++){
            set.add(i);
            solve(mat, cols-1, set, i+1);
            set.remove(i);
        }
        return ans;
    }
    
    void solve(int[][] a, int cols, HashSet<Integer> set, int ind){
        if(cols == 0){
            ans = Math.max(ans, check(a, set));
            return;
        }
        
        for(int i = ind; i < a[0].length - cols + 1; i++){
            set.add(i);
            solve(a, cols-1, set, i+1);
            set.remove(i);
        }        
    }
    
    int check(int[][] a, HashSet<Integer> set){
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < a[0].length; i++){
            if(set.contains(i)){
                continue;
            }
            for(int j = 0; j < a.length; j++){
                if(a[j][i] == 1){
                    s.add(j);
                }
            }
        }
        return a.length - s.size();
    }
    
}

// Code by Md Zaid Alam