class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8)
            return false;
        String special = "!@#$%^&*()-+";
        boolean l = false, u = false, d = false, s = false;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) <= 'z' && password.charAt(i) >= 'a'){
                l = true;
            }else if(password.charAt(i) <= 'Z' && password.charAt(i) >= 'A'){
                u = true;
            }else if(password.charAt(i) <= '9' && password.charAt(i) >= '0'){
                d = true;
            }else{
                s = true;
            }
            if(i > 0 && password.charAt(i-1) == password.charAt(i)){
                return false;
            }
        }
        return l && u && d && s;
    }
}

// Code by Md Zaid Alam