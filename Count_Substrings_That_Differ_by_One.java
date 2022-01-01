class Solution {
    public int countSubstrings(String s, String t) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++){
                int d = 0;
                int a = i, b = j;
                while(a < s.length() && b < t.length()){
                    if(s.charAt(a) != t.charAt(b)) d++;
                    if(d == 1) ans++;
                    if(d == 2) break;
                    a++;
                    b++;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam