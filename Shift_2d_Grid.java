class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = grid.length, m = grid[0].length;
        k = k % (m*n);
        int x = 0;
        for(int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
        }
        for(int i = m*n-k; i < 2*m*n-k; i++){
            int r = (i/m)%n, c = i%m;
            ans.get(x/m).add(grid[r][c]);
            x++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam