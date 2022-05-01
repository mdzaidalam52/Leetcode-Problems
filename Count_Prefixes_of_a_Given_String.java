class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() <= s.length() && s.substring(0, words[i].length()).equals(words[i])){
                   ans++;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam