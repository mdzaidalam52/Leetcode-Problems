class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i+=2*k){
            StringBuilder sb = new StringBuilder(s.substring(i, Math.min(s.length(), i+k)));
            ans.append(sb.reverse());
            if(i+k < s.length())
            ans.append(s.substring(i+k, Math.min(i + 2*k, s.length())));
        }
        return ans.toString();
    }
}

// Code by Md Zaid Alam