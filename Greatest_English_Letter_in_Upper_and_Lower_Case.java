class Solution {
    public String greatestLetter(String s) {
        boolean[] u = new boolean[26], l = new boolean[26];
        for(char c: s.toCharArray()){
            if(c <= 'z' && c >= 'a'){
                l[c-'a']= true;
            }else{
                u[c-'A'] = true;
            }
        }
        String ans = "";
        for(int i = 0; i < 26; i++){
            if(l[i] && u[i]){
                ans = String.valueOf((char)('A' + i));
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam