class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int n = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                n++;
            }else if(c == ')'){
                if(n > 0){
                    n--;
                }else{
                    ans++;
                }
            }
        }
        ans += n;
        return ans;
    }
}

// Code by Md Zaid Alam