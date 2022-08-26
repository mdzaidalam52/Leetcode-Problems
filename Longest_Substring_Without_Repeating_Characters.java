class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] vis = new boolean[128];
        int i = 0, j = 0;
        int ans = 0;
        while(j < s.length()){
            if(vis[s.charAt(j)]){
                while(s.charAt(i) != s.charAt(j)){
                    vis[s.charAt(i)] = false;
                    i++;
                }
                i++;
            }else{
                vis[s.charAt(j)] = true;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam