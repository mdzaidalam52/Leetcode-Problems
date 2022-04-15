class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i < Math.min(n, m)/2; i++){
            for(int j = i; j < m-i; j++)
                ans.add(matrix[i][j]);
            for(int j = i+1; j < n-i; j++)
                ans.add(matrix[j][m-i-1]);
            for(int j = m-i-2; j >= i; j--)
                ans.add(matrix[n-i-1][j]);
            for(int j = n-i-2; j > i; j--)
                ans.add(matrix[j][i]);
        }
        if(Math.min(n, m)%2 == 1){
            int k = Math.min(n, m)/2;
            for(int j = k; j < m-k; j++)
                ans.add(matrix[k][j]);
            for(int j = k+1; j < n-k; j++)
                ans.add(matrix[j][m-k-1]);
        }
        return ans;
    }
}
// Code by Md Zaid Alam