class Solution {
    public boolean detectCapitalUse(String word) {
        if(Character.isUpperCase(word.charAt(0))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i-1)) != Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }else{
            for(char c: word.toCharArray()){
                if(Character.isUpperCase(c)){
                    return false;
                }
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam