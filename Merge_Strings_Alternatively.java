class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < Math.max(word1.length(), word2.length()); i++){
            if(word1.length() > i){
                ans.append(word1.charAt(i));
            }
            if(word2.length() > i){
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}

// Code by Md Zaid Alam