class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        while(n != 1){
            if((n&1) == 0){
                n = n >> 1;
                ans += n;
            }else{
                ans += (n-1)/2;
                n = (n-1)/2 + 1;
            }
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam