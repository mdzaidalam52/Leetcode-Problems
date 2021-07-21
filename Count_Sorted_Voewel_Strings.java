class Solution {
    public int countVowelStrings(int n) {
        if(n == 1)
            return 5;
        int[][] ans = new int[n+1][5];
        Arrays.fill(ans[1], 1);
        for(int i = 2; i <= n; i++){
            ans[i][0] = ans[i-1][0];
            ans[i][1] = ans[i-1][1] + ans[i-1][0];
            ans[i][2] = ans[i-1][1] + ans[i-1][2] + ans[i-1][0];
            ans[i][3] = ans[i-1][1] + ans[i-1][3] + ans[i-1][2] + ans[i-1][0];
            ans[i][4] = ans[i-1][1] + ans[i-1][4] + ans[i-1][3] + ans[i-1][2] + ans[i-1][0];
        }
        
        return ans[n][4] + ans[n][3] + ans[n][2] + ans[n][1] + ans[n][0];
    }
}

// Code by Md Zaid Alam