class Solution {
    public int partitionString(String s) {
        boolean[] a = new boolean[26];
        int ans = 1;
        for(char c: s.toCharArray()){
            if(a[c-'a']){
                ans++;
                a = new boolean[26];
            }
            a[c-'a'] = true;
        }
        return ans;
    }
}

// Code by Md Zaid Alam