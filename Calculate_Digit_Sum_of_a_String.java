class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k)
            return s;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i+=k){
            str.append(value(s.substring(i, Math.min(i+k, s.length()))));
        }
        if(str.length() > k)
            return digitSum(str.toString(), k);
        return str.toString();
    }
    
    String value(String str){
        int a = 0;
        for(char c: str.toCharArray()){
            a += c - '0';
        }
        return String.valueOf(a);
    }
}

// Code by Md Zaid Alam