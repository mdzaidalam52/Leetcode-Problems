class Solution {
    public String longestPalindrome(String s) {
        boolean[][] a = new boolean[s.length()][s.length()];
        int ans = 1, start = 0;
        for(int i = 0; i < s.length(); i++){
            a[i][i] = true;
        }
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                a[i][i+1] = true;
                ans = 2;
                start = i;
            }
        }
        
        for(int i = 3; i <= s.length(); i++){
            for(int j = 0; j < 1 + s.length() - i; j++){
                if(s.charAt(j) == s.charAt(j+i-1) && a[j+1][j+i-2]){
                    a[j][j+i-1] = true;
                    if(ans < i){
                        ans = i;
                        start = j;
                    }
                }
            }
        }
        return s.substring(start, start+ans);
    }
}

// Code by Md Zaid Alam