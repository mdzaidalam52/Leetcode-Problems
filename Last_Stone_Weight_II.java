class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length, sum = 0;
        for(int i : stones)
            sum += i;
        boolean[][] a = new boolean[n+1][sum/2+1];
        a[0][0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sum/2; j++){
                if(j < stones[i-1])
                    a[i][j] = a[i-1][j];
                else
                    a[i][j] = a[i-1][j] || a[i-1][j-stones[i-1]];
            }
        }
        
        for(int i = sum/2; i >= 0; i--){
            if(a[n][i]){
                return sum - 2*i;
            }
        }
        return 0;
    }
}

// Code by Md Zaid Alam