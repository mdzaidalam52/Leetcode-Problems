class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] ans = new int[60];
        int dur = 60;
        int a = 0;
        for(int i = 0; i < time.length; i++){
            ans[time[i]%dur]++;
        }
        
        a += ans[0]*(ans[0] - 1) + ans[30]*(ans[30] - 1);
        a = a >> 1;
        
        for(int i = 1; i < 30; i++){
            a += ans[i]*ans[dur - i];
        }
        return a;
    }
}

// Code by Md Zaid Alam