class Solution {
    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        int[][] a = new int[floor.length()][numCarpets+1];
        for(int[] i: a)
            Arrays.fill(i, -1);
        int[] prefix = new int[floor.length()];
        prefix[0] = floor.charAt(0) - '0';
        for(int i = 1; i < floor.length(); i++){
            prefix[i] = prefix[i-1] + floor.charAt(i) - '0';
        }
        return solve(prefix, numCarpets, carpetLen, 0, a);
    }
    
    int solve(int[] pre, int n, int l, int ind, int[][] a){
        if(pre.length <= ind)
            return 0;
        if(n == 0){
            if(ind != 0){
                return pre[pre.length-1] - pre[ind-1];
            }else{
                return pre[pre.length-1];
            }
        }
        if(a[ind][n] != -1)
            return a[ind][n];
        int k = pre[ind];
        if(ind != 0)
            k -= pre[ind-1];
        int ans = Math.min(solve(pre, n, l, ind+1, a) + k, solve(pre, n-1, l, ind+l, a));
        a[ind][n] = ans;
        return a[ind][n];
            
    }
}

// Code by Md Zaid Alam