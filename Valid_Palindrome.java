class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                if('0' <= c && c <= '9')
                    str.append(c);
                else
                    str.append(Character.toLowerCase(c));
            }
        }
        
        return check(str.toString());
    }
    
    boolean check(String str){
        for(int i = 0; i < (str.length() >> 1); i++)
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        return true;
    }
}

// Code by Md Zaid Alam