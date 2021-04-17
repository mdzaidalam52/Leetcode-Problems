class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder str = new StringBuilder(com(strs[0], strs[1]));
        if(str.length() == 0){
            return "";
        }
        for(int i = 2; i < strs.length; i++){
            str = new StringBuilder(com(str.toString(), strs[i]));
            if(str.length() == 0){
                return "";
            }
        }
        return str.toString();
    }
    
    String com(String s1, String s2){
        int k = 0;
        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                k++;
            }else{
                break;
            }
        }
        if(k == 0){
            return "";
        }
        return s1.substring(0, k);
    }
}

// Code by Md Zaid Alam