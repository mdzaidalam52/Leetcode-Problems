class Solution {
    public int lengthOfLongestSubstring(String s) {
       return solve(s, 0);
    }
    
    public int solve(String s, int j){
        if(j == s.length()){
            return 0;
        }
        int k = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = j; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                k = i - j;
                break;
            }else{
                set.add(s.charAt(i));
            }
        }
        if(k == 0){
            return s.length() - j;
        }
        return Math.max(k, solve(s, j+1));
    }
}

// Code by Md Zaid Alam