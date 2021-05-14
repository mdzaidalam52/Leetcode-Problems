class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] a = new int[triangle.size()][triangle.size()];
        for(int i = 0; i < triangle.size(); i++){
            a[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
        }
        for(int i = triangle.size() - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                a[i][j] = Math.min(a[i+1][j], a[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        
        return a[0][0];
    }
}

// Code by Md Zaid Alam