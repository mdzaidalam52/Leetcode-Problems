class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for(char c : s.toCharArray()){
            a[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            a[c - 'a']--;
        }
        for(int i : a)
            if(i != 0) return false;
        
        return true;
    }
}

// Code by Md Zaid Alam