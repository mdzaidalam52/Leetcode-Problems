class Solution {
    public int balancedStringSplit(String s) {
        if(s.length() == 0)
            return 0;
        int l = s.charAt(0) == 'L' ? 1 : -1;
        int n = s.length();
        int ans = 1;
        for(int i = 1; i < n; i++){
            if(l == 0){
                ans++;
            }
            l += s.charAt(i) == 'L' ? 1 : -1;
        }
        return ans;
    }
}

// Code by Md Zaid Alam