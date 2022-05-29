class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] a = new int[26];
        for(char c: target.toCharArray()){
            a[c-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        int[] b = new int[26];
        for(char c: s.toCharArray()){
            b[c-'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(a[i] != 0){
                ans = Math.min(b[i]/a[i], ans);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam