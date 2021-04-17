class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x%10 == 0 && x != 0){
            return false;
        }
        return check(Integer.toString(x));
    }
    
    boolean check(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam