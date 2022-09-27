class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 1;
        int curr = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) - s.charAt(i-1) == 1){
                curr++;
                ans = Math.max(ans, curr);
            }else{
                curr = 1;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam