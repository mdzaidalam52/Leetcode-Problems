class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] l = new int[n], s = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(rating[i] < rating[j]) l[i]++;
                else if(rating[i] > rating[j]) s[i]++;
            }
        }
        int ans = 0;
        for(int i = 2; i < n; i++){
            for(int j = 1; j < i; j++){
                if(rating[i] > rating[j]) ans += s[j];
                else if(rating[i] < rating[j]) ans += l[j];
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam