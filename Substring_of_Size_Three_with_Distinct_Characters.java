class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3)
            return 0;
        int[] a = new int[26];
        int ans = 0;
        boolean bool = false;
        for(int i = 0; i < s.length(); i++){
            if(i > 2){
                a[s.charAt(i-3) - 'a']--;
                if(a[s.charAt(i-3) - 'a'] == 1)
                    bool = false;
            }
            a[s.charAt(i) - 'a']++;
            if(a[s.charAt(i) - 'a'] > 1)
                bool = true;
            if(!bool && i > 1)
                ans++;
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam