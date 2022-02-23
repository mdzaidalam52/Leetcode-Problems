class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        for(int i = 0; i < 26; i++){
            ans = Math.max(ans, check(s, (char)('A' + i), k));
        }
        return ans;
    }
    
    public int check(String str, char a, int k){
        int ans = 0;
        int s = 0, e = 0;
        while(e < str.length()){
            if(str.charAt(e) == a){
                ans = Math.max(ans, e-s+1);
                e++;
            }else if(k > 0){
                k--;
                ans = Math.max(ans, e-s+1);
                e++;
            }else if(s == e){
                e++;
                s++;
            }else{
                if(str.charAt(s) != a)
                    k++;
                s++;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam