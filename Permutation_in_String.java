class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a = new int[26], b = new int[26];
        for(char c: s1.toCharArray()){
            a[c-'a']++;
        }
        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++){
            b[s2.charAt(i) - 'a']++;
        }
        if(check(a, b))
            return true;
        
        for(int i = s1.length(); i < s2.length(); i++){
            b[s2.charAt(i - s1.length()) - 'a']--;
            b[s2.charAt(i) - 'a']++;
            if(check(a, b))
                return true;
        }
        return false;
    }
    boolean check(int[] a, int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}

// Code by Md Zaid Alam