class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] a = new int[n][amount+1];
        for(int[] arr: a){
            arr[0] = 1;
        }
        for(int i = coins[0]; i <= amount; i++){
            a[0][i] += a[0][i-coins[0]];
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= amount; j++){
                a[i][j] = a[i-1][j];
                if(j >= coins[i]){
                    a[i][j] += a[i][j-coins[i]];
                }
            }
        }
        return a[n-1][amount];
    }
}

// Code by Md Zaid Alam