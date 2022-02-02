class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long max = 0;
        long[] ans = new long[n];
        for(int i = n - 1; i >= 0; i--){
            ans[i] = questions[i][0];
            if(i + questions[i][1] + 1 < n)
                ans[i] += ans[i + questions[i][1] + 1];
            if(i < n-1)
                ans[i] = Math.max(ans[i], ans[i+1]);
            max = ans[i];
        }
        return max;
    }
}

// Code by Md Zaid Alam