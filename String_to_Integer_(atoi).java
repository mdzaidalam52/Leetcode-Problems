class Solution {
    public int myAtoi(String s) {
        int ind = 0, sign = 1, ans = 0;
        if(s.length() == 0)
            return 0;
        while(ind < s.length() && s.charAt(ind) == ' '){
            ind++;
        }
        if(ind == s.length())
            return 0;
        if(s.charAt(ind) == '+' || s.charAt(ind) == '-'){
            sign = s.charAt(ind) == '-' ? -1 : 1;
            ind++;
        }
        
        while(ind < s.length()){
            int digit = s.charAt(ind) - '0';
            if(digit < 0 || digit > 9){
                break;
            }
            if(Integer.MAX_VALUE/10 < ans || Integer.MAX_VALUE/10 == ans && Integer.MAX_VALUE%10 < digit){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            ind++;
        }
        return ans * sign;
    }
}

// Code by Md Zaid Alam